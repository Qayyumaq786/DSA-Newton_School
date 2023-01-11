package assignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MinimizeProduct {
    /**
     *  nums1 = 5 3 4 2
     *  nums2 =   4 2 2 5
     *
     *  2 3 4 5
     *  5 4 2 2
     *
     * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] nums1 = new Integer[n];
        Integer[] nums2 = new Integer[n];
        for(int i=0;i<n;i++){
            nums1[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            nums2[i] = sc.nextInt();
        }

        Arrays.sort(nums1);
        Arrays.sort(nums2, Collections.reverseOrder());

        int ans = 0;
        for(int i=0; i<n;i++){
            ans+= nums1[i]*nums2[i];
        }
        System.out.println(ans);
    }
}
