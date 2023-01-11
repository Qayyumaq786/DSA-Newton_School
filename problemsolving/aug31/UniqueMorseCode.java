package problemsolving.aug31;

import java.util.HashSet;

public class UniqueMorseCode {
    // https://leetcode.com/problems/unique-morse-code-words/

    private String generateMorseCode(String[] morseCodes, String s){
        String result = new String();
        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            int index = c-'a';

            result = result + morseCodes[index];
        }

        return result;
    }

    /**


     A = 65
     B = 66
     C= 67
     D = 68



     'a'->0
     'b' -> 1
     'c' -> 2



     'z'- > 25
     */

    public int uniqueMorseRepresentations(String[] words) {

        String[] morseCodes = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        HashSet<String> hs = new HashSet<>();

        for(String word: words){
            String morseCode = generateMorseCode(morseCodes, word);
            hs.add(morseCode);
        }


        return hs.size();

    }
}
