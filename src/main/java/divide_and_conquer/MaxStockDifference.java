package divide_and_conquer;

public class MaxStockDifference {

    public int maxDifference(int[] arr, int left, int right) {
        if(left == right) return 0;
        int mid = (left + right) / 2;
        int maxDiffLeft = maxDifference(arr, left, mid);
        int maxDiffRight = maxDifference(arr, mid + 1, right);
        int maxHalf = Math.max(maxDiffLeft, maxDiffRight);
        int maxCrossingDiff = maxCrossingDiff(arr, left, right, mid);
        return Math.max(maxHalf, maxCrossingDiff);
    }

    public int maxCrossingDiff(int[] arr, int left, int right, int mid) {

        int minLeftStock = Integer.MAX_VALUE;
        int maxRightStock = Integer.MIN_VALUE;

        for (int i = left; i <= mid; i++) {
            minLeftStock = Math.min(minLeftStock, arr[i]);
        }
        for (int j = mid + 1; j <= right; j++) {
            maxRightStock = Math.max(maxRightStock, arr[j]);
        }
        int diff = maxRightStock - minLeftStock;
        return Math.max(diff, 0);
    }
}
