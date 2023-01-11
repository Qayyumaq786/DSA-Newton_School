package leetcode;

import java.util.*;

public class ThreeSum {
    private List<int[]> twoSum(int[] nums, HashSet<String> hs, int target, int start){

        int ptr1= start;
        int ptr2 = nums.length-1;
        LinkedList<int[]> l = new LinkedList<>();

        while(ptr1<ptr2){


            //System.out.println(-target+" "+nums[ptr1]+" "+nums[ptr2]);

            int sum= nums[ptr1]+nums[ptr2];
            if(sum == target){
                l.add(new int[]{-target, nums[ptr1], nums[ptr2]});
                ptr1++;
                ptr2--;
            }
            else if(sum < target){
                ptr1++;
            }
            else{
                ptr2--;
            }
        }
        return l;
    }


    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        HashSet<String> hs = new HashSet<>();


        Arrays.sort(nums);

        for(int i=0; i<nums.length;i++){
            List<int[]> threeSums =  twoSum(nums, hs ,-nums[i],i+1);

            for(int[] threeSum: threeSums){
                if(threeSum!=null){
                    String s = threeSum[0]+" "+threeSum[1]+" "+threeSum[2];

                    // check for duplicates
                    if(hs.contains(s)){
                        continue;
                    }

                    hs.add(s);

                    ArrayList<Integer> al = new ArrayList<>();
                    al.add(threeSum[0]);
                    al.add(threeSum[1]);
                    al.add(threeSum[2]);
                    res.add(al);
                }
            }

        }

        return res;

    }
}
