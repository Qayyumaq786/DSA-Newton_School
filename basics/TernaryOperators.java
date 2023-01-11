package basics;

import java.util.Scanner;

public class TernaryOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // if a >=10 put the value of b=5 else b=10
        int b = (a>=10) ? 5 : 10  ;
        System.out.println(b);
//        if(a>=10)
//            b = 5;
//        else
//            b = 10;

    }
}
