package hashing;

import java.util.HashMap;

public class LeetcodeValidAnagrams {
    /**
     Approach 1: Convert both to arrays and sort. Them compare each char

     anagram = aaagmnr
     nagaram = aaagmnr

     Time complexity: O(nlogn) + O(n) = O(nlogn)


     abba aaab

     */

    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
            return false;

        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();

        // Generate char count for String s
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            hm1.put(c, hm1.getOrDefault(c,0)+1);
        }

        // Generate char count for String t
        for(int i=0; i<t.length(); i++){
            char c = t.charAt(i);
            hm2.put(c, hm2.getOrDefault(c,0)+1);
        }

        // compare two maps
        return hm1.equals(hm2);
    }
}
