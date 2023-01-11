package assignment;

public class RemoveDuplicatesFromDoublyLinkedList {
    public static Node deleteDuplicates(Node head) {

        if(head==null)
            return head;

        Node cur = head.next;

        while(cur!=null){
            Node next = cur.next;
            // check if node is a duplicate
            if(cur.val == cur.prev.val){
                // delete current node

                cur.prev.next = next;

                if(next!=null)
                    next.prev = cur.prev;

                cur.next = null;
                cur.prev = null;
            }
            cur = next;
        }

        return head;
    }

    static class Node{
        int val;
        Node next;
        Node prev;
    }
}
