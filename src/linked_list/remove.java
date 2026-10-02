package linked_list;

import java.util.*;



public class remove {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
        }
    }

    static ListNode removeZeroSumSublists(ListNode head) {
        List<Integer>list = new ArrayList<>();
        ListNode temp = head;
        while (temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        int idx =0;
        int sum=list.get(0);
        for(int i=1;i<list.size();i++){
            sum+=list.get(i);
            if(sum==0){
                idx=i;
            }
        }
        List<Integer>ansList=new ArrayList<>();
        for(int i=idx;i<list.size();i++){
            ansList.add(list.get(i));
        }
        System.out.println(idx);
        System.out.println(list);
        return head;

    }
    public static ListNode buildLL(int[]heads){
        ListNode head = new ListNode(heads[0]);
        ListNode tail = head;
        for(int i=1;i<heads.length;i++){
            tail.next=new ListNode(heads[i]);
            tail=tail.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[]heads={1,2,-3,3,1};
        ListNode head= buildLL(heads);
        System.out.println(removeZeroSumSublists(head));
    }
}
