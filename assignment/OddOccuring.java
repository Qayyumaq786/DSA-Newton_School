package assignment;

import java.util.Scanner;

public class OddOccuring {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }


        int result = 0;
        for(int i=0; i<n;i++){
            result = result ^ arr[i];
        }

        System.out.println(result);
    }
}
