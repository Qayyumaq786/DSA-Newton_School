package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class LongestConsecutiveSequence {
    static int longestConsecutiveSequence(int[] arr){
        Arrays.sort(arr);
        // 1 2 2 3 4 100 200
        int curLen = 1;
        int maxLen = 1;

        for(int i=1; i<arr.length;i++){
            // ignore duplicates
            if(arr[i] == arr[i-1]){
                continue;
            }

            if(arr[i]==arr[i-1]+1){
                curLen++;
            }
            else{
                curLen = 1;
            }
            maxLen = Math.max(maxLen, curLen);
        }

        return maxLen;

    }

    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(longestConsecutiveSequence(arr));
    }



}
