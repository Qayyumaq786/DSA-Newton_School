package assignment;

import java.util.*;
import java.io.*;


public class LongestSubarrayWithSumK {
    static int longestSubarray(int[] arr, int k){
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        for(int i=0; i<arr.length;i++){
            sum += arr[i];

            if(!hm.containsKey(sum)){
                hm.put(sum,i);
            }

            if(sum == k){
                maxLen = Math.max(maxLen, i+1);
            }
            else if(hm.containsKey(sum-k)){
                maxLen = Math.max(maxLen, i-hm.get(sum-k));
            }
        }
        return maxLen;

    }


    public static void main (String[] args) {
        // Your code here
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while(t--!=0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(longestSubarray(arr, k));
        }

    }


    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try {
                if(st.hasMoreTokens()){
                    str = st.nextToken("\n");
                }
                else{
                    str = br.readLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
