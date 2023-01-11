package arrays.binarySearch;

public class SearchInsertPosition {
    // leetcode: https://leetcode.com/problems/search-insert-position/

    class Solution {


        /**
         Sorted array
         all integers distinct

         return index if target is found
         else return where it should be inserted


         It's a search problem.

         1. Linear search
         2. Binary search

         Since it is a sorted array, we can use binary search.

         1 3 5 6. el = 2

         low = 0
         high = 3 -> 0

         mid = 3/2 = 1



         */

        public int searchInsert(int[] nums, int target) {
            int low = 0;
            int high = nums.length -1;

            while(low<=high){
                int mid = (low+high)/2;

                if(nums[mid] == target){
                    return mid;
                }
                else if(nums[mid] > target){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            return low;
        }
    }

}
