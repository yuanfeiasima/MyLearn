package Fundmentals;

/**
 * Created by wangwentao on 2016/4/27.
 */
public class Exercise1114 {
    public static void main(String[] args) {
//        System.out.println(lg(2, 8)); //3
//        System.out.println(exR1(6)); //311361142246
        //1118
        System.out.println(mystery(2, 25)); //50


    }

    public static int lg(int N, int M) {
        int a = 0;
        while (N >= M) {
            N = N / M;
            a++;
        }
        return a;
    }

    public static String exR1(int n) {
        if (n <= 0) {
            return "";
        } else {
            return exR1(n - 3) + n + exR1(n - 2) + n;
        }
    }

    public static int mystery(int a, int b) {
        if (b == 0) {
            return 0;
        } else if (b % 2 == 0) {
            return mystery(a + a, b / 2);
        } else {
            return mystery(a + a, b / 2) + a;
        }

    }

}
