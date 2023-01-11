package arrays.binarySearch;

public class Search {


    /**
     *
     * Write a function that returns the index of
     * the element el if it exists in the array.
     * Else it returns -1.
     * If multiple elements exists return any index.
     *
     * Time complexity: O(n)
     */
    static int linearSearch(int[] arr, int el){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == el)
                return i;
        }
        return -1;
    }


    /**
     *
     * Write a function that returns the index of
     * the element el if it exists in the array.
     * Else it returns -1.
     * If multiple elements exists return any index.
     *
     * n -> n/2
     * Time complexity : O(logn)
     *
     */
    static int binarySearch(int[] arr, int el){
        int low = 0;
        int high = arr.length - 1;

        while(low<=high){
            int mid = (low+high)/2;

            if(arr[mid] == el){
                return mid;
            }
            else if(arr[mid] > el){
                high = mid - 1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{ 1 ,3, 5, 6};

        int searchIndex = binarySearch(arr, 2);

    }


}
