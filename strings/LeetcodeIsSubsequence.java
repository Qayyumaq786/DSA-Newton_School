package strings;

public class LeetcodeIsSubsequence {

    // link: https://leetcode.com/problems/is-subsequence/

    /**
     ahbgdc


     Since the position is important we cannot sort this.



     t=  ahbgd
     ptr1 = 0 ->1 -> 2 -> 3 ->4 ->5

     s=  abc
     ptr2 = 0 -> 1 -> 2


     */
    public static boolean isSubsequence(String s, String t) {

        int n = s.length();
        int m = t.length();

        int ptr1 = 0;
        int ptr2 =0;

        while(ptr1<m && ptr2<n){
            char cs = s.charAt(ptr2);
            char ct = t.charAt(ptr1);

            if(cs==ct){
                ptr1++;
                ptr2++;
            }
            else{
                ptr1++;
            }
        }

        return ptr2==n;
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc","ahbgdc"));
        System.out.println(isSubsequence("adg", "ahbgdc"));
    }
}
