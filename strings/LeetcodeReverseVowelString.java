package strings;

import java.util.Scanner;

public class LeetcodeReverseVowelString  {

    // Question link: https://leetcode.com/problems/reverse-vowels-of-a-string/


    /**
     leetcode

     You need to reverse the  vowels only.

     What does reversal mean to you?
     Reversal means read from right to left (end to begining)

     Do I need to reverse the entire string or a specific segment?
     I need to reverse only vowels.
     Since I need to reverse only vowels, I'll need to generate string of vowels.


     s = "hello"
     vowelString = "eo"
     ptrVowel = n-1


     ans= "holle"


     Notes:
     1. Write a method that tells you if a character is a vowel or not.
     2. Generate the vowel string


     hello

     vowelString: eo





     */

    /*
    Function to tell if a character is a vowel or not

    Input: character
    Output: boolean
    */
    static boolean isVowel(char c){

        // convert the character to lower case to handle upper cases as well
        c = Character.toLowerCase(c);

        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
            return true;
        else
            return false;
    }

    /*
        Function to generate the vowel string
        Input: String
        Output: String


        hello

        return : eo
    */
    static String generateVowelString(String s){
        String vowelString = new String();

        for(int i=0; i< s.length() ;i++){
            char c = s.charAt(i);

            if(isVowel(c)){
                vowelString = vowelString + c;
            }
        }
        return vowelString;
    }


    public static String reverseVowels(String s) {
        String vowelString = generateVowelString(s);
        int vowelIndex = vowelString.length() -1;

        String ans = new String();

        for(int i=0; i<s.length() ;i++){
            char c = s.charAt(i);

            if(isVowel(c)){
                ans = ans + vowelString.charAt(vowelIndex);
                vowelIndex--;
            }
            else{
                ans = ans + c;
            }
        }

        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(reverseVowels(s));

    }
}
