package arrays.twopointers;

import java.util.Arrays;
import java.util.HashSet;

public class TwoSum {

    /**
     * Given an array of integers, and a targetSum,
     * Write a function which returns true if 2 numbers
     * from the array sum to targetSum else return false.
     *
     * ex:
     * 5, 12, 21, 1 , 6
     * targetSum = 26
     *
     * a+b = targetSum
     * find a and b
     *
     * 5 12
     * 5 21
     * 5 1
     * 5 6
     * 12 21
     * 12 1
     * 12 6
     * 21 1
     * 21 6
     * 1 6
     *
     * Time complexity: O(n^2)
     */
    static boolean twoSumApproach1(int[] arr, int targetSum){
        for(int i=0; i<arr.length-1; i++){ //  O(n)
            for(int j=i+1;  j<arr.length; j++){ // O(n)
                if(arr[i] + arr[j] == targetSum)
                    return true;
            }
        }

        return false;
    }

    /**
     *
     * Since the order of elements is not important,
     * let's try to sort the array.
     *
     * 5, 12, 21, 1 , 6
     *
     * After sorting: 1,5,6,12,21
     *
     *  a+b (variables) = targetSum (given)
     *
     *  a= 1
     *  b = 21
     *
     *  targetSum = 18
     *
     *  a+b is greater than targetSum, hence we need to reduce
     *  the value of targetSum
     *
     *  Since decreasing b will decrease targetSum we move b to one index less.
     *
     *  a=1
     *  b= 12
     *
     *  curSum = a+b = 13
     *  Less than target, we need to increase it.
     *
     *  a=5
     *  b = 12
     *
     *  curSum = a+b = 17
     *  Still less,
     *  let's move a++
     *
     *  a= 6
     *  b = 12
     *  curSum = 18 == targetSum return true
     *
     *  Since there are 2 variables, we can use two pointers
     *
     *  Time complexity: O(nlogn) + O(n) = O(nlogn)
     */
    static boolean twoPointersApproach2(int[] arr , int targetSum){
        Arrays.sort(arr); // O(nlogn) time
        int ptr1 = 0, ptr2 = arr.length-1;

        while(ptr1< ptr2){ // O(n)
            int a = arr[ptr1];
            int b = arr[ptr2];

            if(a+b == targetSum)
                return true;
            else if(a+b > targetSum){
                ptr2--;
            }
            else{
                ptr1++;
            }
        }
        return false;
    }

    /**
     *
     * 5, 12, 21, 1 , 6
     * targetSum = 26
     *
     * a+b = targetSum
     * I already know a, arr[i]
     * b = targetSum- a ( Search for b)
     *
     *  5, 12
     *
     * time complexity:  O(n*1*1) = O(n) time
     * Space complexity: O(n) space
     */
    static boolean twoSumHashSet(int[] arr, int targetSum){
        HashSet<Integer> hs = new HashSet<>(); // O(n) space

        for(int i=0; i<arr.length;i++){ // O(n)
            int b = targetSum - arr[i];
            if(hs.contains(b)) // O(1)
                return true;
            hs.add(arr[i]); // O(1)
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5,12,21,1,6};

        System.out.println(twoPointersApproach2(arr, 15));
    }
}
