package arrays.sorting;

public class MergeTwoSortedArrays {

    /**
     *
     * N = arr1.length
     * M = arr2.length
     *
     * Total time complexity: O(N+M + N+M) = O(2N+2M) = O(N+M) time
     * Total space complexity: O(N+M) space
     */

    static int[] merge(int[] arr1, int[] arr2){
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
        int[] arr1= new int[]{8,9,16,25};
        int[] arr2= new int[]{7,13,14};

        int[] arr = merge(arr1,arr2);
    }

}
