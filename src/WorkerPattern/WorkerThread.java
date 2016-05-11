package WorkerPattern;

/**
 * Created by G on 2016/1/24.
 */
public class WorkerThread extends Thread{

    private static int count = 0;
    private boolean busy = false;
    private boolean stop = false;
    private TaskQueue queue;

    public  WorkerThread(ThreadGroup group, TaskQueue queue){
        super(group, "worker-"+count);
        count++;
        this.queue = queue;
    }

    public void shutdown(){
        stop = true;
        this.interrupt();
        try{
            this.join();
        }catch(InterruptedException ie){}
    }

    public boolean isIdle(){
        return !busy;
    }

    public void run(){
        System.out.println(getName() + "start.");
        while(!stop){
            Task task = queue.getTask();
            if (task != null){
                busy = true;
                task.excute();
                busy = false;
            }
        }
        System.out.println(getName() + "end.");
    }



















}
