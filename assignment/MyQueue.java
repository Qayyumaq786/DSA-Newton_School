package assignment;

import java.util.Stack;

public class MyQueue {
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();


    public void push(int x) {
        st1.push(x);
    }

    public int pop() {
        // Transfer all elements of st1 to st2
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }

        // st2 will contain the top element which needs to be removed
        int val = st2.pop();

        // Transfer back elements to st1
        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }

        return val;
    }


    public int peek() {
        // Transfer all elements of st1 to st2
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }

        // st2 will contain the top element which needs to be removed
        int val = st2.peek();

        // Transfer back elements to st1
        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }

        return val;

    }

    public boolean empty() {
        return st1.isEmpty();
    }
}
