package problemSolving;

import java.util.Arrays;

public class MergeSortedArray {


    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        while (i < m + n && j < n) {
            if (nums1[i] <= nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                int temp = nums1[i];
                shiftRightFromIndex(nums1, m+n-1, i);
                nums1[i] = nums2[j];
                j++;
                i++;
            }
        }
    }

    public static void shiftRightFromIndex(int[] nums, int stopIndex, int startIndex) {
        for (int i = stopIndex - 1; i >= startIndex; i--) {
            nums[i + 1] = nums[i];
        }
    }



    public static void main(String[] args) {
        int[] nums1 = {-1,0,0,3,3,3,0,0,0};
        int m = 6;
        int[] nums2 = {1,2,2};
        int n = 3;
        merge(nums1, m, nums2, n);

        //-1, 0, 0, 1, 2, 2, 3, 3, 3
        System.out.println(Arrays.toString(nums1));
    }
}
