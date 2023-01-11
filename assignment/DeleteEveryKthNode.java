package assignment;

public class DeleteEveryKthNode {
    static void printList(Node head){
        Node ptr = head;
        System.out.print(ptr.data+"->");

        ptr= ptr.next;
        while(ptr!=head){
            System.out.print(ptr.data+"->");
            ptr = ptr.next;
        }

        System.out.println(ptr.data);
    }

    static Node prevNodeToDelete(Node ptr, int k){
        // move k-1 steps
        for(int i=0; i<k-1;i++){
            ptr = ptr.next;
        }
        return ptr;
    }

    static Node deleteKthNode(Node head, Node ptr, int k){
        // delete Node
        Node deleteNode = ptr.next;

        //System.out.println("Deleting node "+ deleteNode.data);

        // Check if deleteNode == head
        if(deleteNode==head){
            head = deleteNode.next;
            //System.out.println("Updating head"+ head.data);
        }

        ptr.next = deleteNode.next;
        deleteNode.next = null;

        return head;
    }


    static Node deleteK(Node head, int k){
//Enter your code here
        Node deleteNodePrev = head;
        while(head!=head.next){
            printList(head);
            deleteNodePrev = prevNodeToDelete(deleteNodePrev,k);
            head = deleteKthNode(head, deleteNodePrev, k);
        }
        printList(head);
        return head;

    }

    static class Node{
        int data;
        Node next;
    }
}
