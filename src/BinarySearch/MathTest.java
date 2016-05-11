package BinarySearch;

/**
 * Created by wangwentao on 2016/4/26.
 */
public class MathTest {
    public static void main(String[] args) {
        long l = (long)-2147483648;
        System.out.println(Math.abs(l));
        System.out.println(Double.POSITIVE_INFINITY);
        System.out.println(Double.NEGATIVE_INFINITY);

        int x = 3;
        double y = 3.1d;
        System.out.println(x < 3.1);

        Long a = Long.valueOf(10);
        Long b = Long.valueOf(10);
        System.out.println(a == b);

        Long c = Long.valueOf(127);
        Long d = Long.valueOf(127);
        System.out.println(c == d);

        Long e = Long.valueOf(128);
        Long f = Long.valueOf(128);
        System.out.println(e == f);

        Integer.valueOf(1);
    }
}
