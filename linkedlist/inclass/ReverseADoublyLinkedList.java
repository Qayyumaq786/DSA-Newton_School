package linkedlist.inclass;

public class ReverseADoublyLinkedList {
    public static Node Reverse(Node head) {
//complete this function
        Node prev=null,cur=head,next;
        while(cur!=null){
            next=cur.next;
            cur.next=prev;
            cur.prev = next;
            prev=cur;
            cur=next;
        }
        return prev;

    }

    class Node{
        Node next;
        Node prev;
        int val;

        Node(int val) {
            this.val = val;
            next = null;
            prev = null;
        }
    }
}
