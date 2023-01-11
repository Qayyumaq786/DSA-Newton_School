package strings;

import java.util.Scanner;

public class StringInputUsingNext {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        String lastName = sc.next();

        System.out.println("Printing both");
        System.out.println("First name= "+ firstName);
        System.out.println("Last name =" + lastName);
    }
}
