package arrays.sorting;

public class BubbleSort {


    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Time complexity: O(n*n) = O(n^2)
    static void bubbleSort(int[] arr){
        // First loop: Repeats the process n-1 times
        for(int i=0; i<arr.length-1; i++){ // O(n) time

            // Compares adjacent elements
            for(int j=1; j< arr.length - i; j++){ // O(n) time
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
            }
        }
    }

    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5,4,3,2,1};

        bubbleSort(arr);
        printArray(arr);
    }

}
