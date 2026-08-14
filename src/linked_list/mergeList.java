package linked_list;

import java.util.ArrayList;
import java.util.Collections;

public class mergeList {
    public static class ListNode{
        ListNode next;
        int val;
        ListNode(int val){
            this.val=val;
        }
    }
    public static ListNode build(ArrayList<Integer>list){
        if(list.size()==0)return null;
        ListNode head =  new ListNode(list.get(0));
        ListNode tail=head;
        for(int i=1;i<list.size();i++){
            tail.next=new ListNode(list.get(i));
            tail=tail.next;
        }
        return head;
    }
    public static ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer>list = new ArrayList<>();
        for(int i=0;i<lists.length;i++){
            ListNode curr = lists[i];
            while(curr!=null){
                list.add(curr.val);
                curr=curr.next;
            }
        }
        Collections.sort(list);
        return build(list);
    }
    public static ListNode buildLL(int[]arr){
        if(arr.length==0)return null;
        ListNode head=new ListNode(arr[0]);
        ListNode tail = head;
        for(int i=1;i<arr.length;i++){
            tail.next=new ListNode(arr[i]);
            tail=tail.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[]head1={1,4,5};
        int[]head2={1,3,4};
        int[]head3={2,6};
        ListNode headA=buildLL(head1);
        ListNode headB=buildLL(head2);
        ListNode headC=buildLL(head3);
        ListNode[]lists={headA,headB,headC};
        System.out.println(mergeKLists(lists));
    }
}
