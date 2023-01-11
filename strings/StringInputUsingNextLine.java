package strings;

import java.util.Scanner;

public class StringInputUsingNextLine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Name ="+ name);
    }
}
