package hashing;

import java.util.HashSet;

public class LeetcodeHappyNumbers {
    /**
     n=19
     n = 1 + 9*9 = 82
     n = 8*8 + 2*2 = 68
     n = 6*6 + 8*8 = 100
     n = 1*1 + 0 + 0 = 1

     1. You need to write a function, which will find sum of square of digits of n.
     */

    /**
     n = 2
     n = 4
     n = 16
     n = 37
     n = 58
     n = 89
     n = 64 + 81 = 145
     N = 1 + 16+25 = 42
     n = 18
     n = 1 + 64 = 65
     n = 36 + 25 = 61
     n = 37

     Store for the numbers discovered so far, and search if the new number already exists.

     I'll use a hashset

     */

    /**
     n =123

     sum = 1*1 + 2*2 + 3*3

     123%10 = 3
     123/10 = 12 %10 = 2
     12/10 = 1
     1/10= 0
     */
    int sumOfSquares(int n){
        int sum = 0;
        while(n!=0){
            int digit = n%10;
            sum += digit*digit;
            n = n/10;
        }
        return sum;
    }


    public boolean isHappy(int n) {
        HashSet<Integer> hs = new HashSet<>();

        while(n!=1 && !hs.contains(n)){
            hs.add(n);
            n = sumOfSquares(n);
        }

        return n==1;

    }
}
