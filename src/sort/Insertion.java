package sort;

/**
 * Created by G on 2016/2/3.
 */
public class Insertion extends Example{

    public static void sort(Comparable[] a){
        int N = a.length;
        for (int i = 0; i < N; i++){
            for (int j = i; j > 0 && less(a[j], a[j-1]); j--){
                exch(a, j, j-1);
            }
        }
    }

}
