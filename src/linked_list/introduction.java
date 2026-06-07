package linked_list;

public class introduction {
    public static int length(Node head){
        int count =0;
        while(head!=null){
            count++;
            head =head.next;
        }
        return count;
    }
    public static int lengthr(Node head){
        if(head == null) return 0;
        return 1 +lengthr(head.next);
    }

    public static void displayrr(Node head){
        if(head==null) return;
        displayrr(head.next);
        System.out.print(head.data+" ");
    }
    public static void displayr(Node head){
        if(head==null) return;
        System.out.print(head.data+" ");
        displayr(head.next);
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;

        }
    }
    public static class Node {
        int data;//value
        Node next;//address
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a =new Node(5);
        Node b =new Node(3);
        Node c =new Node(9);
        Node d =new Node(8);
        Node e =new Node(16);
        //5 3 9 8 16
        a.next=b;
        //5-->3 9 8 16
        System.out.println(b.data);
        System.out.println(a.next.data);
        b.next=c;
        c.next=d;
        d.next=e;
        //5-->3-->9-->8-->16
        //displaying the data with loop
         Node temp = a;
//        for(int i=0;i<=5;i++){
//            System.out.print(temp.data+" ");
//            temp =temp.next;
//        }
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
        display(a);
        System.out.println();
        displayr(a);
        System.out.println();
        displayrr(a);
        System.out.println();
        System.out.print(length(a));
        System.out.println();
        System.out.println(lengthr(a));
    }
}
