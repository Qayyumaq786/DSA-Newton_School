package advanceddsa.dp;

import java.util.Arrays;

public class LongestPalindromicSubsequence {
    /**
     * s = "bbbab"
     *
     * i       j
     * b b b a b
     *
     * f(0, n-1) -> denotes the length of longest palindromic
     *              subsequence between index 0 and n-1
     *
     *  f(i,j):
     *
     *  if(i>j){
     *      return 0;
     *  }
     *  if(i==j){
     *      return 1;
     *  }
     *  if(s[i] == s[j]){
     *      return 2+ f(i+1, j-1);
     *  }
     *  else{
     *      return max(f(i+1,j) , f(i,j-1));
     *  }
     *
     */

    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        if(n<=1){
            return n;
        }
        int[][] dp = new int[n][n];
        for(int[] a: dp){
            Arrays.fill(a, -1);
        }

        return lps(s,dp, 0, n-1);
    }

    private int lps(String s,
                    int[][] dp, int i, int j){

        if(i > j){
            return 0;
        }
        else if(i==j){
            return 1;
        }
        else if(dp[i][j] != -1){
            return dp[i][j];
        }
        else{
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);

            if(c1 == c2){
                dp[i][j] = 2 + lps(s,dp,i+1,j-1);
            }
            else{
                dp[i][j] = Math.max(lps(s, dp,i+1, j), lps(s, dp,i, j-1));
            }

            return dp[i][j];
        }
    }
}
