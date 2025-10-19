package divide_and_conquer;


import java.util.logging.Logger;

public class MergeSort {
    Logger logger = Logger.getLogger(MergeSort.class.getName());


    public int[] mergeSort(int[] arr) {
       // logger.info("ARR "+Arrays.toString(arr));

        if(arr.length < 2) return arr;
        int mid = arr.length / 2;
        int[] left = new int[mid];
        for(int i=0;i<mid;i++) {
            left[i]=arr[i];
        }
        int [] right = new int[arr.length-mid];
        for(int j=0;j<right.length;j++) {
            right[j]=arr[j+mid];
        }
//        logger.info("left  before "+Arrays.toString(left));
//        logger.info("right before "+Arrays.toString(right));
        left = mergeSort(left);
        right = mergeSort(right);
//        logger.info("left  after "+Arrays.toString(left));
//        logger.info("right after "+Arrays.toString(right));
        return mergeSortedArrays(left,right);

        //divide array in two halves
        //recursively sort each half
        //merge the sorted halves

    }

    public int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] result = new int[len1 + len2];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < len1 && j < len2) {
            if (arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        while (i < len1) {
            result[k++] = arr1[i++];
        }

        while (j < len2) {
            result[k++] = arr2[j++];
        }

        return result;
    }
}
