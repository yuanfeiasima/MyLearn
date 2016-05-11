/**
 * Created by G on 2016/3/20.
 */
public class suanfa {

    public static void main(String[] args) {
//        for (int i =4; i >= -4; i--) {
//            for (int j = 0; j < Math.abs(i)+3; j++) {
//                System.out.print(" ");
//            }
//            for (int j =0; j < 2*(5-Math.abs(i))-1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        circle(20);
    }

    public static void circle(int r) {
        int x;
        int rr = r * r;
        for (int y = r; y >= -r; y--) {
            x = (int) (Math.sqrt(rr - y * y));
            show(r, x);
        }
    }

    public static void show(int r, int x) {
        for (int i = -r; i < -x; i++) {
            System.out.print(" ");
        }
        System.out.print("*");
        if (x > 0) {
            for (int i = -x+1; i < x; i++) {
                System.out.print(" ");
            }
            System.out.print("*");
        }
        System.out.println();
    }
}
