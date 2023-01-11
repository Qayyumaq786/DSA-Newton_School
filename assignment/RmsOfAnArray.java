package assignment;

import java.util.Scanner;

public class RmsOfAnArray {

    /**
     N-> size of the array

     Input:
     n-> size of array
     array space separated

     Compute square of all the values.
     and then take it's mean

     mean = sum of all elements / number of elements
     */

    static double computeRms(int[] arr){
        // Step1: Square all the values
        for(int i=0; i<arr.length;i++){
            arr[i] = arr[i] * arr[i];
        }

        // Compute sum
        int sum = 0;
        for(int i=0; i<arr.length;i++){
            sum+= arr[i];
        }

        double mean = (double)sum/arr.length;
        return Math.sqrt(mean);
    }

    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        double rms = computeRms(arr);
        System.out.println(String.format("%.6f",rms));

    }
}
