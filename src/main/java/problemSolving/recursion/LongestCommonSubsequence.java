package problemSolving.recursion;

import java.util.Arrays;

public class LongestCommonSubsequence {

    public static void main(String[] args) {
        String str1 = "pmjghexybyrgzczy";
        String str2 = "hafcdqbgncrcbihkd";

        int dp[][] = new int[str1.length()][str2.length()];
        for(int[] row : dp ){
            Arrays.fill(row, -1);
        }

        System.out.println("LongestCommonSubsequenceLength by Recursion "
                + longestSubsequenceLengthRecursion(str1, str2, str1.length()-1, str2.length()-1));

        System.out.println("longestSubsequenceLengthRecursionMemoize "
                + longestSubsequenceLengthRecursionMemoize(str1, str2, str1.length()-1, str2.length()-1, dp));

        System.out.println("longestSubsequenceLengthRecursionDPTabulation "
                + longestSubsequenceLengthRecursionDPTabulation(str1, str2, str1.length(), str2.length()));

    }

    static int longestSubsequenceLengthRecursion(String str1, String str2, int i, int j){
        if(i<0 || j<0)
            return 0;
        if(str1.charAt(i)==str2.charAt(j)){
            return 1 + longestSubsequenceLengthRecursion(str1, str2, i-1, j-1);
        }else {
            return Math.max(longestSubsequenceLengthRecursion(str1, str2, i-1, j),
                    longestSubsequenceLengthRecursion(str1, str2, i, j-1));
        }
    }


    static int longestSubsequenceLengthRecursionMemoize(String str1, String str2, int i, int j, int[][] dp){
        if(i<0 || j<0)
            return 0;
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(str1.charAt(i)==str2.charAt(j)){

            dp[i][j] = 1 + longestSubsequenceLengthRecursionMemoize(str1, str2, i-1, j-1, dp);
        }else {
            dp[i][j] = Math.max(longestSubsequenceLengthRecursionMemoize(str1, str2, i-1, j, dp),
                    longestSubsequenceLengthRecursionMemoize(str1, str2, i, j-1, dp));
        }
        return dp[i][j];
    }

    static int longestSubsequenceLengthRecursionDPTabulation(String str1, String str2,int m, int n){
        int[][] dp = new int[m+1][n+1];
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){

                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
}
