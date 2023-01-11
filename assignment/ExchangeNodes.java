package assignment;

public class ExchangeNodes {
    public static Node exchangeNodes(Node head) {
//Enter your code here
        Node lastNode = head.next;
        Node prevLastNode = null;
        while(lastNode.next!=head){
            prevLastNode = lastNode;
            lastNode = lastNode.next;
        }

        Node nextToHeadNode = head.next;

        prevLastNode.next = head;
        head.next = lastNode;
        lastNode.next = nextToHeadNode;

        return lastNode;

        // swap values

    }

    static class Node{
        int data;
        Node next;
    }
}
