package divide_and_conquer;

public class MaxSubArraySum {

    public  int recursiveMaxSubArraySum(int[] arr, int left, int right) {
        if(left == right) return arr[left];
        int mid = (left+right)/2;
        int maxLeft = recursiveMaxSubArraySum(arr, left, mid);
        int maxRight = recursiveMaxSubArraySum(arr, mid+1, right);
        int maxHalf =  Math.max(maxLeft, maxRight);
        return Math.max(maxHalf, maxCrossingSum(arr, left, mid, right));
    }

    public int maxCrossingSum(int[] arr, int left, int mid, int right) {
        int leftSum = Integer.MIN_VALUE;
        int rightSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = mid; i>= left ; i--){
            sum = sum + arr[i];
            if(sum > leftSum){
                leftSum = sum;}
        }
        sum= 0;
        for(int j = mid+1; j<= right; j++){
            sum = sum + arr[j];
            if(sum > rightSum){rightSum = sum;}
        }
        return leftSum + rightSum;
    }
}
