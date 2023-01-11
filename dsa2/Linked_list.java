package dsa2;

public class Linked_list {
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;

        }
    }
    Node head;

    void push(int d){
        Node new_node=new Node(d);
        if(head==null){
            head=new_node;

        }
        else {
            new_node.next=head; //1<-2<-3<-4<-5
            head=new_node;
        }
    }

}
