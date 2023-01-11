package advanceddsa.dp;

import java.util.Arrays;

public class ZeroOneKnapsackProblem {

    static int getMaxValue(int[] wt, int[] val, int maxWeight){
        int n = wt.length;
        int[][] dp = new int[maxWeight+1][n];

        for(int[] arr: dp){
            Arrays.fill(arr, -1);
        }

        return knapsack(wt, val,dp, maxWeight, n-1);
    }

    static int knapsack(int[] wt, int[] val,int[][] dp, int w, int i){
        if(i<0){
            return 0;
        }
        else if(dp[w][i] !=- 1){
            return dp[w][i];
        }
        else{
            if( wt[i] > w){
                dp[w][i] = knapsack(wt, val, dp, w, i-1);
            }
            else{
                dp[w][i] = Math.max(
                       val[i]+ knapsack(wt, val, dp, w- wt[i], i-1),
                        knapsack(wt,val,dp,w,i-1)

                );
            }
            return dp[w][i];
        }
    }
}
