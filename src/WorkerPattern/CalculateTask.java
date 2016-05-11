package WorkerPattern;

/**
 * Created by G on 2016/1/24.
 */
public class CalculateTask implements Task{

    private static int count = 0;
    private int num = count;

    public CalculateTask(){
        count++;
    }

    @Override
    public void excute() {
        System.out.println("[CalculateTask " + num + "] start...");
        try{
            Thread.sleep(3000);
        }catch(InterruptedException ie){
            System.out.println("[CalculateTask " +num +"] done...");
        }
    }
}
