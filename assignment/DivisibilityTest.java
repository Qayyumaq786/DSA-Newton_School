package assignment;

import java.util.Scanner;

public class DivisibilityTest {
    static boolean isDivisbleByThirty(String s){
        int n = s.length();
        // Computing sum of elements of the String
        int sum = 0;

        for(int i=0; i < n ;i++){
            char c = s.charAt(i);
            sum += c-'0';
        }

        return (s.charAt(n-1)=='0' && sum%3==0);
    }

    public static void main (String[] args) {
        // Your code here

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        if(isDivisbleByThirty(s)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
