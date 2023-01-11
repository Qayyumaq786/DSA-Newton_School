package basics;

import java.util.Scanner;

public class FunctionsExample {
    // Write a piece of code that gives you sum of two integers
     static int sumTwoIntegers(int a, int b){
         int sum = a+b;
         return sum;
     }

     // Write a function to multiply two doubles and one int

    /**
     * Input: double, double, int
     * Output: double
     */
      static double multiplyFn(double d1, double d2, int i1){
          double result = d1*d2*i1;
          return result;
      }

    /**
     * If you don't want to return anything
     * the return type is void
     *
     */
    static  void printHelloWorld(){
        System.out.println("Hello World");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum1 = sumTwoIntegers(a,b);

        System.out.println(sum1);

        printHelloWorld();
    }
}
