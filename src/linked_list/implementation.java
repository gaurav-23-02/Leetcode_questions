package linked_list;

public class implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class LinkedList{
        Node head =null;
        Node tail =null;
        void insertAtStart(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                temp.next=head;
                head=temp;

            }
        }
        void deleteAtIndex(int idx) {
            Node temp = head;
            if(idx==0){
                head=head.next;
                return;
            }
            for(int i=0;i<idx-1;i++){
                temp=temp.next;
            }temp.next=temp.next.next;
        }
        int getAt(int idx){
            Node temp= head;
            for(int i=1;i<=idx;i++){
                temp=temp.next;
            }return temp.data;
        }
        void insertAt(int idx,int val){
            Node t = new Node(val);
            Node temp = head;
            if (idx==size()){
                insertAtEnd(val);
            }
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
        }
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;

            }

        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
        int size(){
            int count=0;
            Node temp=head;
            while(temp!=null){
                count++;
                temp = temp.next;
            }return count;

        }
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(4);
        ll.insertAtEnd(6);
        ll.insertAtEnd(5);
        ll.insertAtStart(3);
        ll.display();
        ll.insertAt(2,10);
        ll.insertAt(0,3);
        ll.insertAt(6,12);
        System.out.println();
        System.out.print("size of linked  list ");
        System.out.print(ll.size());
        System.out.println();
        ll.display();
        System.out.println();
        System.out.println("data at the give index "+ll.getAt(+3));
        ll.deleteAtIndex(0);
        ll.deleteAtIndex(0);
        ll.display();
    }
}