package assignment;


import java.util.*;
import java.io.*;

public class TheEndGame {
    /**

     p1.   p2
     1 3 -1 -3 5 3 6 7

     k = 3

     PriorityQueue->{5,6,7}

     3 3 5 6 7


     */

    static void solve(int[] arr, int k){
        TreeMap<Integer,Integer> tm = new TreeMap<>(Collections.reverseOrder());
        int ptr1=0, ptr2=0;
        // initial elements
        while(ptr2<k-1){
            tm.put(arr[ptr2], tm.getOrDefault(arr[ptr2],0)+1);
            ptr2++;
        }

        while(ptr2<arr.length){
            tm.put(arr[ptr2], tm.getOrDefault(arr[ptr2],0)+1);
            System.out.print(tm.firstEntry().getKey()+" ");
            tm.put(arr[ptr1], tm.get(arr[ptr1])-1);

            if(tm.get(arr[ptr1])==0){
                tm.remove(arr[ptr1]);
            }
            ptr1++;
            ptr2++;
        }
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        solve(arr,k);
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
