package linked_list;

import java.util.ArrayList;
import java.util.Collections;

public class leetcode_61 {
    public static class ListNode{
        ListNode next;
        int val;
        ListNode(int val){
            this.val=val;
        }
    }
    public static ListNode buildll(ArrayList<Integer>list){
        if(list.size()==0){
            return null;
        }
        ListNode head = new ListNode(list.get(0));
        ListNode tail = head;
        for(int i=1;i<list.size();i++){
            tail.next=new ListNode(list.get(i));
            tail=tail.next;
        }
        return head;
    }
    public static ListNode rotateRight(ListNode head, int k) {
        ArrayList<Integer>list = new ArrayList<>();
        ListNode temp =head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        Collections.rotate(list,k);
        System.out.println(list);
        return buildll(list);

    }
    public static ListNode buildLL(int[]nums){
        if(nums.length==0)return null;
        ListNode head = new ListNode(nums[0]);
        ListNode tail = head;
        for(int i=1;i<nums.length;i++){
            tail.next=new ListNode(nums[i]);
            tail=tail.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[]heads={1,2,3,4,5};
        ListNode head = buildLL(heads);
        System.out.println(rotateRight(head,2));
    }
}
