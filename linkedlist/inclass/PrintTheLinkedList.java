package linkedlist.inclass;

public class PrintTheLinkedList {
    // Just use this code
    public static void printList(Node head) {
        Node ptr = head;

        while(ptr!=null){
            System.out.print(ptr.val + " ");
            ptr = ptr.next;
        }
    }

    // only to avoid compiler issues
    class Node {
        Node next;
        int val;

        Node(int val) {
            this.val = val;
            next = null;
        }
    }
}
