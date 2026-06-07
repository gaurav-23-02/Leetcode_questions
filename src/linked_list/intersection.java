package linked_list;

public class intersection {
    public static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public static class Linkedlist{
        Node head=null;
        Node tail=null;
    }
    public static int length(Node head){
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }return count;
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }
    public static void main(String[] args) {
        Linkedlist ll =new Linkedlist();
        Node a= new Node(100);
        Node b= new Node(13);
        Node c= new Node(4);
        Node d= new Node(5);
        Node e= new Node(12);
        Node f= new Node(10);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        display(a);
        Linkedlist pl =new Linkedlist();
        Node aa= new Node(90) ;
        Node bb= new Node(9) ;
        aa.next=bb;
        bb.next=d;
        System.out.println();
        display(aa);
        System.out.println();
        System.out.println(length(a));
        System.out.println(length(aa));


    }
}
