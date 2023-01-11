package advanceddsa.assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class KMostOccuringElements {

    static int sumKMostFrequent(int[] arr, int k){
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i: arr){
            hm.put(i, hm.getOrDefault(i,0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>
                (Collections.reverseOrder());

        for(int val : hm.values()){
            pq.offer(val);
        }

        int sum = 0;
        while (k--!=0){
            sum += pq.poll();
        }
        return sum;

    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while(t--!=0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n ;i++){
                arr[i] = sc.nextInt();
            }

            int k = sc.nextInt();
            System.out.println(sumKMostFrequent(arr,k));
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
