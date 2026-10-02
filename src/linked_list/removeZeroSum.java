package linked_list;

import java.util.ArrayList;
import java.util.List;

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
    static ListNode removeZeroSumSublists(ListNode head) {
        ArrayList<Integer>list= new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        int idx=0;
        for(int i=1;i<list.size();i++){
            int sum=list.get(0);
            sum+=list.get(i);
            System.out.println(sum);
            if(sum==0){
                idx=i;
            }
        }
        ArrayList<Integer> ansList=new ArrayList<>();
        for(int i=idx;i<list.size();i++){
            ansList.add(list.get(i));
        }
        System.out.println(ansList);
        return build(ansList);
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
        int[]head2={1,2,-3,3,1};
        ListNode head22=buildll(head2);
        ListNode head=buildll(head1);
        System.out.println(removeZeroSumSublists(head22));
        System.out.println(removeElements(head,6));

    }
}
