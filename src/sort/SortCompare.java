package sort;

import org.apache.commons.lang3.time.StopWatch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wangwentao on 2016/2/3.
 */
public class SortCompare {

    public static long time(String alg, Comparable[] a){
        StopWatch timer = new StopWatch();
        timer.start();
        if (alg.equals("Insertion")){
            Insertion.sort(a);
//            Insertion.show(a);
        }
        if (alg.equals("Shell")){
            Shell.sort(a);
//            Shell.show(a);
        }
        timer.stop();
        return timer.getTime();
    }

//    public static double timeRandomInput(String alg, int N, int T){
//
//    }

    public static void main(String[] args){
//        String[] a = {"S","H","E","L","L","S","O","R","T","E","X","A","M","P","L","E"};
        String chars = "qwertyuiopasdfghjklzxcvbnm";
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 100000; i++){
            Character c = chars.charAt((int)(Math.random()*26));
            list.add(c.toString());
        }
        String[] a =  list.toArray(new String[list.size()]);
        String alg = "Shell";
        long time = time(alg, a);
        System.out.println();
        System.out.print(time);

        alg = "Insertion";
        time = time(alg, a);
        System.out.println();
        System.out.print(time);

    }
}
