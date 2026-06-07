package linked_list;

public class doubly_linked_list {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
        }
    }
    public static void insertAtIdx(Node head, int idx, int val) {
        Node s = head;
        for (int i = 1; i <= idx; i++) {
            s = s.next;
        }
        Node r = s.next;
        Node t = new Node(val);
        s.next = t;
        t.prev = s;
        t.next=r;
        r.prev=t;
    }
    public static void insertAtTail(Node head,int val){
        Node temp = head;
        //through head take the temp to  tail
        while(temp.next!=null){
            temp=temp.next;
        }
        Node t =new Node (val);
        temp.next=t;
        t.prev=temp;
    }
    public static Node insertAtHead(Node head,int val){
        Node t = new Node(val);
        t.next=head;
        head.prev=t;
        head=t;
        return head;
    }
    public static void Displayrandom(Node random){
        Node temp=random;
        while(temp.prev!=null){
            temp=temp.prev;
        }
        display(temp);
    }
    public static void display2(Node tail){
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }
        System.out.println();
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a =new Node(3);
        Node b =new Node(4);
        Node c =new Node(5);
        Node d =new Node(6);
        Node e =new Node(7);
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        display(a);
        display2(e);
        Displayrandom(c);
        Node newHead=insertAtHead(a,4);
        display(newHead);
        insertAtTail(a,5);
        display(a);
        insertAtIdx(a,2,10);
        display(a);

    }

}
