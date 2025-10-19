package searching;

import java.util.logging.Logger;

public class BinarySearch {
    static Logger logger = Logger.getLogger(BinarySearch.class.getName());

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(binarySearchRec(arr, 8, 0, arr.length - 1));
        System.out.println(binarySearchRec(arr, 90, 0, arr.length - 1));
    }

    public static int binarySearchRec(int[] array, int target, int low, int high) {
        if (low > high) {
            logger.info(target + " Not Found");
            return -1;
        }
        int mid = (low + high) / 2;
        if (array[mid] == target) {
            logger.info(target + "  Found at " + mid);
            return mid;
        }
        if (array[mid] < target) {
            return binarySearchRec(array, target, mid + 1, high);
        } else {
            return binarySearchRec(array, target, low, mid - 1);
        }
    }
}
