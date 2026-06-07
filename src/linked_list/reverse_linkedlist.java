package linked_list;
public class reverse_linkedlist {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }
//    public static Node reverseloop(Node head){
//        Node curr;
//        Node prev;
//        Node after;
//        while(curr!=null){
//            after = curr.next;
//
//        }
//    }
    public static void  display(Node head){
        if(head==null) return ;
        System.out.print(head.val+" ");
        display(head.next);
    }
    public static void  displayreverse(Node head) {
        if (head == null) return;
        displayreverse(head.next);
        System.out.print(head.val + " ");
    }
    public static Node reversell(Node head){
        if(head.next==null) return head;
        Node newhead = reversell(head.next);
        head.next.next=head;
        head.next =null;
        return newhead;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node (3);
        a.next=b;
        b.next=c;
        display(a);
        System.out.println();
        displayreverse(a);
        Node r = reversell(a);
        display(a);

    }
}
