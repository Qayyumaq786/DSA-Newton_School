package assignment;

import java.util.Scanner;

public class MaximumDifferenceArray {

    static int[] leftMinArray(int[] arr){
        int[] lMin = new int[arr.length];

        lMin[0] = 0;
        for(int i=1; i<arr.length;i++){
            if(arr[i] < arr[lMin[i-1]]){
                lMin[i] = i;
            }
            else{
                lMin[i] = lMin[i-1];
            }
        }

        return lMin;
    }

    static int[] rightMaxArray(int[] arr){
        int[] rMax = new int[arr.length];
        rMax[arr.length-1] = arr.length-1;
        for(int i=arr.length-2; i>=0;i--){
            if(arr[i] > arr[rMax[i+1]]){
                rMax[i] = i;
            }
            else{
                rMax[i] = rMax[i+1];
            }
        }

        return rMax;
    }

    static int maximumDifferenceArray(int[] arr){
        int[] lMin = leftMinArray(arr);
        int[] rMax = rightMaxArray(arr);
        int maxDiff = -1;
        int ptr1=0, ptr2=0;

        while(ptr1<arr.length && ptr2 < arr.length){
            if(arr[ lMin[ptr1] ] < arr [rMax[ptr2]]){
                maxDiff = Math.max(maxDiff, rMax[ptr2] - lMin[ptr1]);
                ptr2++;
            }
            else{
                ptr1++;
            }
        }

        return maxDiff;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(maximumDifferenceArray(arr));
    }

}
