package BinarySearch;

/**
 * Created by wangwentao on 2016/4/26.
 * 二分查找必须是有序数组
 */
public class BinarySearch {

    public static int rank(int key, int[] arr) {
        return rank(key, arr, 0, arr.length - 1, 0);
    }

    private static int rank(int key, int[] arr, int low, int hi, int deep) {
        System.out.println("deep:" + deep++);
        System.out.println("low:" +low +",high:" + hi);
        if (low > hi ) {
            return -1;
        }
        int mid = low + (hi - low) / 2;
        if (key < arr[mid]) {
            return rank(key, arr, 0, mid - 1, deep);
        } else if (key > arr[mid]) {
            return rank(key, arr, mid + 1, hi, deep);
        } else {
            return mid;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int result = rank(8, arr);
        System.out.println(result);
    }
}
