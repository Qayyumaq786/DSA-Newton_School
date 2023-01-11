package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class MaxProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }


        Arrays.sort(arr);
        int max = Math.max(arr[0]*arr[1], arr[n-1]*arr[n-2]);
        System.out.println(max);
    }

}
