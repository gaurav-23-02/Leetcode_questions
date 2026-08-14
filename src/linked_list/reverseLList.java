package linked_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class reverseLList {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
        }
    }
    public static ListNode build(ArrayList<Integer>list){
        if(list.size()==0)return null;
        ListNode head = new ListNode(list.get(0));
        ListNode tail = head;
        for(int i=0;i<list.size();i++){
            tail.next=new ListNode(list.get(i));
            tail=tail.next;
        }
        return head;
    }
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode curr = head;
        ArrayList<Integer>list = new ArrayList<>();
        while(curr!=null){
            list.add(curr.val);
            curr=curr.next;
        }
        System.out.println(list);
        Collections.reverse(list.subList(left+1,right+1));
        System.out.println(list);
        return head;
    }

    public static ListNode modifiedList(int[] nums, ListNode head) {
        ArrayList<Integer>list = new ArrayList<>();
        ListNode curr = head;
        while(curr!=null){
            list.add(curr.val);
            curr=curr.next;
        }
        System.out.println(list);
        for(int x:nums){
            if(list.contains(x)){
                list.remove(x);
            }
        }
        return build(list);
    }
    public static ListNode BuildLL(int[]arr){
        if(arr.length==0)return null;
        ListNode head = new ListNode(arr[0]);
        ListNode tail = head;
        for(int i=1;i<arr.length;i++){
            tail.next=new ListNode(arr[i]);
            tail=tail.next;
        }
        return head;
    }
    public void reorderList(ListNode head) {

    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        int[]head1={1,2,3,4,5};
        int[]nums={1,2,3};
        ListNode heada =BuildLL(head1);
        System.out.println(modifiedList(nums,heada));
        ListNode head = BuildLL(arr);
        System.out.println(reverseBetween(head,2,4));
    }
}
