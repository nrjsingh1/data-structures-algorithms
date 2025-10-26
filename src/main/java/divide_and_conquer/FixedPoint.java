package divide_and_conquer;

/*You are given a sorted (from smallest to largest) array
A of n distinct integers which can be positive, negative, or zero. You
want to decide whether or not there is an index i such that A[i] = i.
Design the fastest algorithm you can for solving this problem.*/
public class FixedPoint {

    public int findFixedPoint(int[] arr ,int left,int right) {
        if(left > right) return -1;
        int mid = (left + right)/2;
        if(arr[mid] == mid) return mid;
        if(arr[mid]<mid) {
            return findFixedPoint(arr,mid+1,right);
        }
        if(arr[mid]>mid) {
            return findFixedPoint(arr,left,mid-1);
        }
        return -1;
    }

}
