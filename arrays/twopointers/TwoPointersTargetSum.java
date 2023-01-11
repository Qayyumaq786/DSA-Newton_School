package arrays.twopointers;

public class TwoPointersTargetSum {

    /**
     * Write a function which takes an array as input,
     * and targetSum.
     * Return true, if a subarray exists with
     * sum equal to target else return false.
     *
     *
     * Time complexity: O(n*n*n) = O(n^3)
     */
    static boolean subarraySum(int[] arr, int targetSum){

        for(int i = 0; i< arr.length; i++){ // O(n)
            for(int j = i; j< arr.length ; j++){ // O(n)

                int sum = computeSum(arr, i, j); // O(n)

                if(sum == targetSum)
                    return true;

            }
        }
        return false;
    }

    // Time complexity: O(n)
    static int computeSum(int[] arr, int low, int high){
        int sum =0;
        for(int i = low; i<=high; i++){
            sum+= arr[i];
        }

        // low = 2  high = 2= 3
        return sum;
    }


    //First optimization: Precompute sum
    // Time complexity: O(n^2)
    static boolean subarraySumApproach2(int[] arr, int targetSum){

        // Precompute sum from index 0 to i
        for(int i=1; i< arr.length; i++){
            arr[i] = arr[i]+ arr[i-1];
        }

        for(int i = 0; i< arr.length; i++){ // O(n)
            for(int j = i; j< arr.length ; j++){ // O(n)

                int sum = computeSumApproach2(arr, i, j); // O(1)

                if(sum == targetSum)
                    return true;

            }
        }
        return false;
    }

    // Time complexity: O(1)
    static int computeSumApproach2(int[] arr, int low, int high){
        if(low==0)
            return arr[high];
        else
            return arr[high] - arr[low-1];
    }


    //
    static boolean twoPointerApproach(int[] arr, int targetSum){
        int ptr1=0, ptr2=0;
        int curSum = 0;

        while(ptr1<=ptr2 && ptr2< arr.length){


            if(curSum==targetSum)
                return true;
            else if(curSum > targetSum){
                curSum -= arr[ptr1];
                ptr1++;
            }
            else{
                ptr2++;
                if(ptr2 < arr.length)
                    curSum += arr[ptr2];
            }
        }
        return false;
    }



}
