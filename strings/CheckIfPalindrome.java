package strings;

import java.util.Scanner;

public class CheckIfPalindrome {

    /**
     * Given a string, return true if a string is a palindrome
     * else return false.
     *
     * Palindrome: A palindrome is a string which is same when read forward and backward.
     *
     * example: abba
     */
    static boolean isPalindrome(String s){
        /**
         * If we look at string, for it to be palindrome, I need to compare
         * first element with last
         * second element with second and so on.
         * If at any point, they aren't equal I'll return false.
         */
        int ptr1 = 0, ptr2= s.length()-1;

        while(ptr1 < ptr2){
            char c1 = s.charAt(ptr1);
            char c2 = s.charAt(ptr2);

            if(c1==c2){
                ptr1++;
                ptr2--;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean palindrome = isPalindrome(s);
        System.out.println(palindrome);
    }

}
