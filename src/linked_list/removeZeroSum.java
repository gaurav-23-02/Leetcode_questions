package linked_list;

import java.util.ArrayList;

public class removeZeroSum {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
            next=null;
        }
    }
    public static ListNode build(ArrayList<Integer>list){
        if(list.size()==0)return null;
        ListNode head = new ListNode(list.get(0));
        ListNode tail=head;
        for(int i=1;i<list.size();i++){
            tail.next=new ListNode(list.get(i));
            tail=tail.next;
        }
        return head;
    }
    public static ListNode removeElements(ListNode head, int val) {
        ArrayList<Integer>list = new ArrayList<>();
        ListNode curr = head;
        while(curr!=null){
            if(curr.val!=val){
                list.add(curr.val);
            }
            curr=curr.next;
        }
        System.out.println(list);
        return build(list);
    }
    public static ListNode buildll(int[]arr){
        if (arr.length == 0) return null;

        ListNode head = new ListNode(arr[0]);
        ListNode tail = head;

        for (int i = 1; i < arr.length; i++) {
            tail.next = new ListNode(arr[i]);
            tail = tail.next;
        }

        return head;
    }

    public static void main(String[] args) {
        int[]head1 = {1,2,6,3,4,5,6};
        ListNode head=buildll(head1);
        System.out.println(removeElements(head,6));

    }
}
