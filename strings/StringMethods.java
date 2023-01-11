package strings;

public class StringMethods {
    public static void main(String[] args) {

        String s = new String("hardik");
        // To find length of the string use: length()
        int length = s.length();
        System.out.println("Length of string is =" + length);

        // Suppose you want to find character at index i
        // use charAt(i)
        char index3 = s.charAt(3);
        System.out.println("Character at index 3 =" + index3);

        String s2 = new String("khandelwal");
        String name = s+" "+s2;
        System.out.println("Concatenated name="+name);

        String subStr = s.substring(2,5);
        System.out.println("Substring = "+subStr);
    }
}
