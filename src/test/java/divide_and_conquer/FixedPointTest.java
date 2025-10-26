package divide_and_conquer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FixedPointTest {

    FixedPoint fixedPoint = new FixedPoint();

    @Test
    void findFixedPoint() {
        int[] arr = {-10,-5,0,3,7};
        assertEquals(3, fixedPoint.findFixedPoint(arr, 0, arr.length-1));
        int[] arr2 = {0,2,5,8,17};
        assertEquals(0, fixedPoint.findFixedPoint(arr2, 0, arr2.length-1));
        int[] arr3 = {-10,-5,3,4,7,9};
        assertEquals(-1, fixedPoint.findFixedPoint(arr3, 0, arr3.length-1));
        int[] arr4 = {-3,-1,0,1,3,4,6};
        assertEquals(6, fixedPoint.findFixedPoint(arr4, 0, arr4.length-1));
        int[] arr5 = {-1,0,1,2};
        assertEquals(-1, fixedPoint.findFixedPoint(arr5, 0, arr5.length-1));
    }

}