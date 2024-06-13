package problemSolving;

import java.util.TreeSet;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int [] nums = {10,9,2,5,3,7,101,18};
        System.out.println(" DP Longest Increasing Subsequence Size-" +findLISSizeDP(nums));
        System.out.println(" TreeSet Longest Increasing Subsequence Size-" +findSizeUsingTreeSet(nums));
        System.out.println(" TreeSet Longest Increasing Subsequence -" +findLISTreeSet(nums));
    }

    static int findLISSizeDP(int[] nums){
        int [] dp = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            dp[i]=1;
            for(int j =0;j<i;j++){
                if(nums[i]>nums[j])
                    dp[i] = Math.max(dp[i], dp[j]+1);
            }
        }
        int max =0;
        for(int i =0;i<dp.length;i++)
            max = Math.max(max, dp[i]);
        return max;
    }

    static int findSizeUsingTreeSet(int[] nums){
        TreeSet<Integer> ts = new TreeSet<>();
        for(int i =0;i< nums.length;i++){
            if(ts.ceiling(nums[i])!=null)
                ts.remove(ts.ceiling(nums[i]));
            ts.add(nums[i]);
        }
        return ts.size();
    }

    static TreeSet<Integer> findLISTreeSet(int[] nums){
        TreeSet<Integer> ts = new TreeSet<>();
        for(int i =0;i< nums.length;i++){
            if(ts.ceiling(nums[i])!=null)
                ts.remove(ts.ceiling(nums[i]));
            ts.add(nums[i]);
        }
        return ts;
    }
}
