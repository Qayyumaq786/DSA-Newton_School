package dsa2;

public class sa {
    //1 -> 2-> 3 ->4 -> 5 ->null   k=2
    public static void main(String[] args) {
        Linked_list ll=new Linked_list();
        ll.push(1);
        ll.push(2);
        ll.push(3);
        ll.push(4);
        ll.push(5);
        Linked_list.Node curr= ll.head;
        int k=4;
        for (int i=0;i<k-2;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        curr=ll.head;
        Linked_list.Node test=null;
        while (curr!=null){
            Linked_list.Node temp=curr.next;
            curr.next=test;
            test=curr;
            curr=temp;


        }
        while (test!=null){
            System.out.print(test.data+" ");
            test=test.next;

        }




    }
}
