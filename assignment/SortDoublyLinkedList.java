package assignment;

public class SortDoublyLinkedList {
    Node merge(Node first, Node second) {
        if (first == null) {
            return second;
        }
        if (second == null) {
            return first;
        }
        if (first.data < second.data) {
            first.next = merge(first.next, second);
            first.next.prev = first;
            first.prev = null;
            return first;
        } else {
            second.next = merge(first, second.next);
            second.next.prev = second;
            second.prev = null;
            return second;
        }
    }

    Node split(Node head) {
        Node fast = head, slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        Node temp = slow.next;
        slow.next = null;
        return temp;
    }

    Node mergeSort(Node node, int n) {

        if (node == null || node.next == null) {
            return node;
        }
        Node second = split(node);
        node = mergeSort(node,n);
        second = mergeSort(second,n);

        return merge(node, second);
    }


    static class Node {
        int data;
        Node prev, next;
    }
}
