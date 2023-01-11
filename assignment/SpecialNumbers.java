package assignment;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int count = 0;

        for(long i=1; i<= (long)Math.sqrt(n);i++){
            if(n%i==0){
                count += 1;

                if(n/i!=i){
                    count+=1;
                }
            }
        }

        System.out.println(count);
    }
}
