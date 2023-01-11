package strings;

import java.util.Arrays;

public class LeetcodeFindTheDifference {

    // https://leetcode.com/problems/find-the-difference/

    /**
     s = "abdc"
     t = "abcde"

     What do I know so far?
     t contains all characters of s, and an extra character

     Output: Return that extra character

     b a d e
     b d d e a


     a b d e
     a b d e f

     Output: d

     */

    /*
        Approach 1:
        Convert string into array of characters

        Sort and compare index by index
    */
    char appraoch1(String s, String t){
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i=0; i<arr1.length; i++){
            if(arr1[i]!=arr2[i])
                return arr2[i];
        }

        return arr2[arr2.length-1];
    }


    /*
            1 3 9 8 2 = sum1 = 1+3+9+8+2
            1 2 8 9 = sum2 = 1+2+8+9

            take difference = 3

            each character is associated with an integer value.

    */
    public char findTheDifference(String s, String t) {
        int sum1 = computeStringSum(s);
        int sum2 = computeStringSum(t);
        int diff = sum2-sum1;
        return (char)diff;
    }

    int computeStringSum(String s){
        int sum = 0;
        for(int i=0; i<s.length();i++){
            char c  = s.charAt(i);
            sum+=c;
        }
        return sum;
    }

}
