package Stacks;

public class linkedlist_implemenntation {
    public static class Node{//user define data type
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class Stack{//user define data structure
        Node head =null;
        int size =0;
        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }
        void displayrec(Node h){
            if(h==null) return;
            displayrec(h.next);
            System.out.print(h.val+" ");
        }
        void display(){
            displayrec(head);
            System.out.println();

        }
        void displayrev(){
            Node temp =head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        int size(){
            return size;
        }
        int pop(){
            if(head==null){
                System.out.println("stack is empty");
                return -1;
            }else {
                int x = head.val;
                head = head.next;
                size--;
                return x;

            }

        }
        int peek() {
            if (head == null) {
                System.out.println("stack is empty");
                return -1;

            }
            return head.val;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4);//4
        st.display();
        st.push(3);//4 3
        st.display();
        st.push(1);//4 3 1
        st.display();
        st.pop();
        st.display();
        System.out.println(st.size());
        st.push(6);
        st.push(7);
        st.push(9);
        st.display();
        st.push(9);
        st.push(0);
        st.display();

    }
}
