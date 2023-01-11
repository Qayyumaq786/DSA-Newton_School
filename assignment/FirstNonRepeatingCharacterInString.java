package assignment;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatingCharacterInString {

    static int getFirstNonRepeatingCharacter(String s){
        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            hm.put(c, hm.getOrDefault(c,0)+1);
        }

        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            if(hm.get(c)==1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(getFirstNonRepeatingCharacter(s));
    }
}
