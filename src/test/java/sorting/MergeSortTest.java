package sorting;

import divide_and_conquer.MergeSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    MergeSort mergeSort = new MergeSort();

    @Test
    void mergeSortedArrays() {
        int[] arr1 = { 0,1,3,5,9};
        int[] arr2 = { 2,4,6,7,8};
        int[] expected = { 0,1,2,3,4,5,6,7,8,9};
        int[] result = mergeSort.mergeSortedArrays(arr1, arr2);
        assertArrayEquals(expected, result);
    }

    @Test
    void mergeSort(){
        int[] arr = { 6,0,4,1,7,3,5,9,2,8};
        int[] expected = { 0,1,2,3,4,5,6,7,8,9};
        assertArrayEquals(expected, mergeSort.mergeSort(arr));
    }
}