package divide_and_conquer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxStockDifferenceTest {

    MaxStockDifference maxStockDifference = new MaxStockDifference();
    @Test
    void maxStockDifference() {
        int[] arr = new int[] {7,1,5,3,6,4};
        assertEquals(5,maxStockDifference.maxDifference(arr, 0, arr.length - 1));
    }
}