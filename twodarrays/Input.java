package twodarrays;

import java.io.*;
import java.util.*;

public class Input {
    /**
     * Given two integers n and m, where n is
     * number of rows m is number of columns.
     * Take input of a 2d array.
     *
     * example:
     * 2 3
     * 1 2 3
     * 4 5 6
     */
    public static void main(String[] args) {
        FastReader sc = new FastReader();

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        // first loop is for row
        for(int i=0; i<n;i++){
            // second loop is for column
            for(int j=0; j<m;j++){
                arr[i][j] = sc.nextInt();
            }
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
