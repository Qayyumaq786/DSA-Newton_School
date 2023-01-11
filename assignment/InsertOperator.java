package assignment;

import java.util.Scanner;

public class InsertOperator {

    static boolean isSumK(long[] arr, int index, long sum, long k){
        if(index==-1){
            return sum==k;
        }
        else{
            return isSumK(arr, index-1, sum+arr[index], k)
                    || isSumK(arr, index-1, sum - arr[index], k);
        }
    }

    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        long[] arr = new long[n];

        for(int i=0; i<n;i++){
            arr[i] = sc.nextLong();
        }

        if(isSumK(arr, n-1, 0, k)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }



    }
}
