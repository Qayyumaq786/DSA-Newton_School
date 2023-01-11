package arrays.oned;

public class ArrayBasicOperations {

    static int arraySum(int[] arr){
        int sum = 0;

        for(int i=0; i< arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }

    /**
     * Write a function to return sum of
     * the sub-array between index start and index stop
     */
    int subArraySum(int[] arr, int start, int end){
        int sum = 0;
        for(int i = start; i<=end ; i++){
            sum = sum+ arr[i];
        }
        return sum;
    }

    /**
     * Write a function, to return the product of subarray
     *  between index start and index end.
     */
    static int subArrayProduct(int[] arr, int start, int end){
            int product = 1;

            for(int i= start; i <=end; i++){
                product*= arr[i];
            }
            return product;
    }

    /**
     * Write a function to swap 2 indexes,
     * i and j of an array.
     */
    static void swap(int[] arr,  int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * Write a function to search for an element in the array.
     */
    static boolean isElementPresent(int[] arr, int el){

        for(int i=0; i<arr.length; i++){
            if(arr[i]==el)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // this is another way of declaring an
        // array when you want to hard code the elements.
        // not necessary to use it.
        int[] arr = new int[]{4,3,2,1};

        System.out.println(isElementPresent(arr, 1));
        System.out.println(isElementPresent(arr,5));
    }
}
