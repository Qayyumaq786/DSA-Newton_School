import java.util.Scanner;
import java.util.Stack;

public class Dsa2h {
    public static void main(String[] args) {
        //(x)
        //false
        //((x))
        //true
        //(x+y + (p+q))
        //false
        //(x+y + ((p+q)))
        //true
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        int n=s.length();
        Stack<Character>st=new Stack<>();
        for (int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(ch);

            }

        }

    }
}
