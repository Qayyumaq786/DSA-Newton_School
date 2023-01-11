package advanceddsa.assignments;

import java.util.HashSet;
import java.util.Scanner;

public class CountNumbers {
    static int countNumbers(int n){

        if(n == 0){
            return 1;
        }

        int ans = 0;

        // computing answers for all 2,3.....n digits
        for(int i=2; i<=n;i++){
            ans += countUniqueNumbersOfNDigits(i-1, new HashSet<>());
        }

        // Adding 10 to consider all 1 digit numbers
        return ans + 10;
    }

    static int countUniqueNumbersOfNDigits(int i,
                                           HashSet<Integer> numbersAlreadyConsidered){
        if(i < 0){
            return 1;
        }
        else{
            int count = 0;
            for(int j= (i>0 ?0 :1); j<=9; j++){
                if(numbersAlreadyConsidered.contains(j)){
                    continue;
                }
                numbersAlreadyConsidered.add(j);
                count += countUniqueNumbersOfNDigits(i-1, numbersAlreadyConsidered);
                numbersAlreadyConsidered.remove(j);
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countNumbers(n));
    }
}
