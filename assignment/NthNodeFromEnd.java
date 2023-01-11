package assignment;

public class NthNodeFromEnd {
    static int getNthFromLast(Node head, int n)
    {
        Node ptr1 = head;
        Node ptr2 = head;
        int count = 0;
        while(n!=0 && ptr2!=null){
            ptr2 = ptr2.next;
            count++;
            n--;
        }

        if(n>count){
            return -1;
        }


        if(ptr2==null && n>0){
            return -1;
        }

        while(ptr2!=null){
            ptr1= ptr1.next;
            ptr2 = ptr2.next;
        }

        return ptr1.data;
    }



    static class Node{
        int data;
        Node next;
    }
}
