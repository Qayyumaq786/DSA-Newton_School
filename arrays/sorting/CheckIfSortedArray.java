package arrays.sorting;

import java.util.Arrays;

public class CheckIfSortedArray {


    /**
     * Write a function which takes an array as input,
     * and returns if the array is in sorted order or not.
     * Consider increasing sequence (ascending order)
     *
     * Input: int[]
     * Output: boolean
     *
     *
     * ex:
     * arr = [1,5,19,21,25,37]
     *
     */
    static boolean isArraySorted(int[] arr){
        for(int i=1; i<arr.length;i++){
            if(arr[i] < arr[i-1])
                return false;
        }
        return true;
    }

    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,5,21,19,37,25};
        System.out.println(isArraySorted(arr));

        // Inbuilt function to sort
        Arrays.sort(arr);

        printArray(arr);

        System.out.println(isArraySorted(arr));
    }

}
