package assignment;

import java.util.Scanner;

public class NoXor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];


        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        long sum = 0;
        for(int i=1; i<=n;i++){
            sum +=  (long)arr[i-1] ^ (n-i);
        }

        System.out.println(sum);
    }
}
