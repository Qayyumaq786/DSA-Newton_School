package basics;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         float f = sc.nextFloat();
         double d = sc.nextDouble();
         System.out.println(a +" "+f+" "+d);
    }
}
