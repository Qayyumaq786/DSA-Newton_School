package basics;
import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        /**
         * Write a program to take two integers as input from the user.
         * And print the sum.
         */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a+b;
        System.out.println(sum);
    }
}
