package assignment;

public class StackImplementationOfLinkedList {
    Node top = null;
    public void push(int x){
//enter your code here
        Node ptr = new Node(x);
        ptr.next = top;
        top = ptr;
    }

    public void pop(){
//enter your code here
        if(top==null){
            return;
        }
        else{
            top = top.next;
        }
    }

    public void top(){
//enter your code here
        if(top==null){
            System.out.println(0);
        }
        else{
            int val = top.val;
            System.out.println(val);
        }
    }


    // Don't copy paste this
    class Node{
        Node next;
        int val;

        Node(int val) {
            this.val = val;
            next = null;

        }
    }
}
