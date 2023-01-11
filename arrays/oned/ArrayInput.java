package arrays.oned;

import java.util.Scanner;

public class ArrayInput {

    /**
     *  Take an integer n as input.
     *  Followed by n space separated integers
     *
     *  Store these integers
     *  Compute the sum of these integers
     *
     *  eg
     *  5
     *  4 5 1 2 3
     */

    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static int getArraySum(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        printArray(arr);

        int sum = getArraySum(arr);
        System.out.println(sum);
    }
}
