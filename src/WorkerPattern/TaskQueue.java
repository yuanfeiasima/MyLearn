package WorkerPattern;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by wangwentao on 2016/1/24.
 */
public class TaskQueue {

    private List queue = new LinkedList();

    public synchronized Task getTask(){
        while(queue.size()==0){
            try{
                this.wait();
            }catch(InterruptedException ie){
                return null;
            }
        }
        return (Task) queue.remove(0);
    }

    public synchronized void putTask(Task task){
        queue.add(task);
        this.notifyAll();
    }
}
