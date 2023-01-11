package recursion;

public class BinarySearchRecursive {

    static int bs(int[] arr, int low, int high, int el){

        if(low>high)
            return -1; // element doesn't exist

        int mid = (low+high)/2;
        if(arr[mid] == el){
            return mid;
        }
        else if(arr[mid] > el){
            return bs(arr, low, mid-1, el);
        }
        else{
            return bs(arr, mid+1, high, el);
        }
    }
}
