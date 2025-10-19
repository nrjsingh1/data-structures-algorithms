package divide_and_conquer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxSubArraySumTest {
    MaxSubArraySum maxSubArraySum = new MaxSubArraySum();

    @Test
    void maxSubArraySum() {
        int[] arr = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int left = 0;
        int right = arr.length-1;
        assertEquals(maxSubArraySum.recursiveMaxSubArraySum(arr, left, right), 6);
    }
}