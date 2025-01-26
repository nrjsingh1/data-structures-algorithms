package problemSolving.recursion;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {

        int[] arr = new int[]{2,3,7,6,4,5,9};
        sortRec(arr,arr.length-1);
        System.out.println(Arrays.toString(Arrays.stream(arr).toArray()));
    }

    public static void sortRec(int[] arr, int pos){
        if(pos == 0)
            return;
        int last = arr[pos];
        sortRec(arr, pos-1);
        ;
    }
}
