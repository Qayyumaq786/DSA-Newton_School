package problemsolving.aug31;

import java.util.HashSet;

public class IntersectionOfArrays {
    // https://leetcode.com/problems/intersection-of-two-arrays/
    /**
     1. Since each element must be unique, and order is not important. Question indicates towards using a hashset to store result.
     2. We can create 2 sets,
     1st set to store one array
     2nd set to store the result

     3. Iterate through other array and check if element exist, and then add it to result set.

     4. Since we want to return int[] as answer, convert the set to int[]

     HashSet contains method time complexity:
     */
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> arrSet  = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        // putting all elements of nums1 in arrSet
        for(int el: nums1)
            arrSet.add(el);

        // step 3
        for(int el: nums2){
            if(arrSet.contains(el)){
                result.add(el);
            }
        }

        // step 4
        int[] ans = new int[result.size()];
        int index = 0;
        for(int el: result){
            ans[index++] = el;
        }
        return ans;

    }
}
