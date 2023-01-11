package assignment;

import java.util.Scanner;
import java.util.Stack;

public class LongestValidParenthesis {

    static int lengthOfLongestValidParenthesis(String s){
        Stack<Integer> st = new Stack<>();
        int maxLen = 0;

        st.push(-1);
        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);

            if(c=='('){
                st.push(i);
            }
            else{
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                }
                else{
                    maxLen = Math.max(maxLen, i-st.peek());
                }
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(lengthOfLongestValidParenthesis(s));
    }
}
