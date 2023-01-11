package arrays.oned;

public class RotateSubarray {


    static void rotateArray(int[] arr){
        int low = 0;
        int high = arr.length -1;

        int lastElement = arr[high];

        for(int i = low+1; i<=high; i++){
            arr[i] = arr[i-1];
        }

        arr[low] = lastElement;
    }

    static void rotateSubarray(int[] arr, int low, int high){
        int lastElement = arr[high];

        for(int i= low+1; i<=high; i++){
            arr[i] = arr[i-1];
        }

        arr[low] = lastElement;
    }

}
