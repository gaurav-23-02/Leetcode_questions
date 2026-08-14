package linked_list;

import java.util.*;

public class leetcode_3217 {
    public static class ListNode{
        ListNode next;
        int val;
        ListNode(int val){
            this.val=val;
        }
    }
    public static ListNode modifiedList(int[] nums, ListNode head) {

        return head;
    }
    public static ListNode buildll(int[]nums){
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
        int[] nums={1,2,3};
        int[]heads={1,2,3,4,5};
        ListNode head =buildll(heads);
        System.out.println(modifiedList(nums,head));

    }
}
