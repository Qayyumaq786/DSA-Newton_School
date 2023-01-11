package arrays.sorting;

public class MergeSort {


    /**
     *
     * Time complexity: O(nlogn)
     * Space complexity: O(n)
     */
    static void mergeSort(int[] arr){
        mergeSortUtil(arr, 0, arr.length-1);
    }


    static void mergeSortUtil(int[] arr, int low, int high){ // O(logn) times

        if(low >= high)
            return;

        int mid = (low+high)/2;

        // Divide this array into 2 parts from mid
        mergeSortUtil(arr, low, mid);
        mergeSortUtil(arr, mid+1, high);

        // Merge these two arrays
        merge(arr, low, mid, high); // Time complexity: O(n)
    }

    static void merge(int[] arr, int low, int mid, int high){
        // We need to create 2 arrays arr1, arr2 from arr based on values
        // of low high and mid
        int n = mid-low+1;
        int m = high-mid;

        int[] arr1 = new int[n];
        int[] arr2 = new int[m];

        // Adding values to these 2 arrays
        for(int i=low, j=0; i<=mid; i++,j++){
            arr1[j] = arr[i];
        }

        for(int i=mid+1, j=0; i<=high; i++,j++){
            arr2[j] = arr[i];
        }

        // Now let's find the merged array
        int[] mergedArray = mergeTwoSortedArrays(arr1,arr2);

        // Copy the merge array between low to high
        for(int i=low, j=0; j<mergedArray.length; i++,j++){
            arr[i] = mergedArray[j];
        }

    }

    static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;

        int[] mergedArray = new int[n+m]; // O(N+M) space
        int ptr1= 0;
        int ptr2 = 0;
        int index = 0;

        while(ptr1<n && ptr2<m){ // O(N+M) time
            if(arr1[ptr1] < arr2[ptr2]){
                // add ptr1 element
                mergedArray[index++] = arr1[ptr1];
                ptr1++;
            }
            else{
                mergedArray[index++] =  arr2[ptr2];
                ptr2++;
            }
        }

        while(ptr1<n){ // O(N)
            mergedArray[index++] = arr1[ptr1];
            ptr1++;
        }

        while(ptr2<m){ // O(M)
            mergedArray[index++] = arr2[ptr2];
            ptr2++;
        }

        return mergedArray;
    }




    public static void main(String[] args) {
        int[] arr = new int[]{38,27,43,3,9,82,10};
        mergeSort(arr);
    }
}
