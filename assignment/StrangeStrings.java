package assignment;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class StrangeStrings {

    static String getStrangeString(int n){
        Deque<Character> dq = new LinkedList<>();
        int count = 0;

        for(int i=1; i<=n;i++){
            if(i%2!=0){
                // i is odd
                char c = (char)('a'+count);
                dq.offerFirst(c);
            }
            else{
                char c = (char)('a'+count);
                dq.offerLast(c);
            }

            count++;
            count = count%26;// to repeat from 'a' after 'z'
        }


        // Take elements out of the dequeue from front
        StringBuilder sb = new StringBuilder();

        while(!dq.isEmpty()){
            char c = dq.pollFirst();
            sb.append(c);
        }

        return sb.toString();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getStrangeString(n));
    }
}
