package problemsolving.aug31;

public class MissingNumber {
    // https://leetcode.com/problems/missing-number
    /**
     arr.length = n

     0,1,2,3,4,..... n-1,n

     arrElements:
     example:
     3,0,1

     arr.length = 3

     0+1+2+3 = 6

     arraySum = 0+1+3= 4

     1+2+3+4....+n = (n)*(n+1)/2;


     */
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int arraySum =0;
        int sum = n*(n+1)/2;

        for(int i=0; i<nums.length;i++){
            arraySum += nums[i];
        }

        return sum - arraySum;
    }
}
