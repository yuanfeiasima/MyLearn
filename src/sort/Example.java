package sort;

import junit.framework.Assert;

/**
 * Created by wangwentao on 2016/2/3.
 */
public class Example {

//    public abstract void sort(Comparable[] a);

    public static boolean less(Comparable v, Comparable w){
        return v.compareTo(w.toString()) < 0;
    }

    public static void exch(Comparable[] a, int i, int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void show(Comparable[] a){
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }

    public static boolean isSorted(Comparable[] a){
        for (int i = 1; i < a.length; i++){
            if (less(a[i], a[i-1])){
                return false;
            }
        }
        return true;
    }

//    public static void main(String[] arg){
//        String[] args = {"a", "r", "h", "n", "e", "j", "r", "k", "v", "m"};
//        this.sort(args);
//        Assert.assertFalse(isSorted(args));
//        show(args);
//    }

}
