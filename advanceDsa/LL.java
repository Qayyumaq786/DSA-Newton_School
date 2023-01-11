package advanceDsa;

import java.util.Scanner;
import java.util.Stack;

public class LL {

    class Node{
        Node next;
        int data;
        Node(int d){
            data=d;
            next=null;
        }
    }
    Node head;
    Node curr;
    void push(int d){
        Node new_node=new Node(d);
        if(head==null){
            head=new_node;
            curr=new_node;
        }
        else {
            curr.next=new_node;
            curr=new_node;

        }


    }
    void Merge(LL q)
    {
        Node p_curr = head, q_curr = q.head;
        Node p_next, q_next;

        // While there are available positions in p;
        while (p_curr != null && q_curr != null) {

            // Save next pointers
            p_next = p_curr.next;
            q_next = q_curr.next;

            // make q_curr as next of p_curr
            q_curr.next = p_next; // change next pointer of q_curr
            p_curr.next = q_curr; // change next pointer of p_curr

            // update current pointers for next iteration
            p_curr = p_next;
            q_curr = q_next;
        }
        q.head = q_curr;
    }




    public static void main(String[] args) {
        LL list1=new LL();
        list1.push(1);
        list1.push(2);
        list1.push(3);
        list1.push(4);
        list1.push(5);

        LL list2=new LL();
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for (int i=0;i<n;i++){
            int k= sc.nextInt();
            list2.push(k);
        }

        list1.Merge(list2);

        LL.Node curr=list1.head;
        while (curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }







    }
}
