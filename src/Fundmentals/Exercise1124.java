package Fundmentals;

/**
 * Created by wangwentao on 2016/4/27.

 */
public class Exercise1124 {

    public static void main(String[] args) {
//        int result = commonDivisor(319, 377); //29
        int result = commonDivisor(1111111, 1234567); //29
        System.out.println("result:" + result);
    }

    /**
     * 辗转相除法
     * @param x
     * @param y
     * @return
     */
    public static int commonDivisor(int x, int y) {
        if (x ==1|| y==1) {
            System.out.println("x="+x+"y="+y);
            return 1;
        }
        if (x < y) {
            int temp = x;
            x = y;
            y = temp;
        }
        System.out.println("x="+x+"y="+y);
        int yushu = x % y;
        if (yushu == 0) {
            return y;
        } else {
            x = y;
            y = yushu;
            System.out.println("x=" + x + "y=" + y);
            return commonDivisor(x, y);
        }
    }
}
