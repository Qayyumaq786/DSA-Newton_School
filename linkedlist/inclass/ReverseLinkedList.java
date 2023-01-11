package linkedlist.inclass;

public class ReverseLinkedList {
    // https://leetcode.com/problems/reverse-linked-list/

    public ListNode reverseList(ListNode head) {
        ListNode prev=null,cur=head,next;
        while(cur!=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }

    class ListNode{
        int val;
        ListNode next;
    }
}
