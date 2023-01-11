package strings;

import java.io.StringReader;

public class StringDefinition {
    public static void main(String[] args) {
        // 1st way using double quotes
        String s1 = "hardik";

        // 2nd way of defining a string
        String s2 = new String(); // This will be an empty String.

        // Passing a string and new operator
        String s3 = new String("hardik");

        // Passing a character array
        char[] arr = new char[]{'h', 'a', 'r', 'd', 'i', 'k'};
        String s4 = new String(arr);
    }
}
