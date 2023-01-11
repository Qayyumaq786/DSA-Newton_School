package linkedlist.inclass;

public class DeleteMiddleOfLinkedList {
    /**

     1->2->3->4->5
     n = 5

     1->2->3->4->5->6
     n = 6

     moves = n/2-1 = 6/2-1= 3-1=2

     ptr = 1 -> 2 -> 3
     moves = 2 -> 1 -> 0


     n/2-1 positions = 1


     1. Write a method to find the number of elements in the linkedlist
     2. Move n/2 -1 positions
     3. Write code for deletion ptr.next = ptr.next.next

     // corner case: What if there is only 1 element
     1 -> null

     */

    static int getNodeCount(Node head){
        Node ptr = head;
        int n = 0;
        while(ptr!=null){
            ptr = ptr.next;
            n++;
        }
        return n;
    }

    public static Node deleteMiddleElement(Node head) {
        // return the head of the modified Linked List

        // corner case
        // if(head==null || head.next==null){
        //     return null;
        // }
        if(head.next==null){
            head.val = -1;
            return head;
        }
        // step 1
        int n = getNodeCount(head);
        Node ptr = head;
        // step 2
        int moves = n/2-1;

        while(moves!=0){
            ptr = ptr.next;
            moves--;
        }

        // delete the node
        ptr.next = ptr.next.next;

        return head;
    }

    class Node {
        Node next;
        int val;

        Node(int val) {
            this.val = val;
            next = null;
        }
    }
}
