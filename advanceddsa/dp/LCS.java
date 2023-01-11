package advanceddsa.dp;

import java.util.Arrays;

public class LCS {
    public int longestCommonSubsequence(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        if(n==0 || m==0){
            return 0;
        }

        int[][] dp = new int[n][m];
        for(int[] a: dp){
            Arrays.fill(a, -1);
        }

        return lcs(s1, s2, dp, n-1, m-1);

    }

    private int lcs(String s1, String s2,
                    int[][] dp, int i, int j){

        if(i<0 || j<0){
            return 0;
        }
        else if(dp[i][j] != -1){
            return dp[i][j];
        }
        else{
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(j);

            if(c1 == c2){
                dp[i][j] = 1 + lcs(s1,s2,dp,i-1,j-1);
            }
            else{
                dp[i][j] = Math.max(
                        lcs(s1,s2,dp,i-1,j),
                        lcs(s1,s2,dp,i,j-1)
                        );
            }

            return dp[i][j];
        }
    }
}
