package linked_list;

import java.util.ArrayList;
import java.util.Collections;

public class SortList {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
            next=null;
        }
    }
    public static ListNode build(ArrayList<Integer> list){
        if(list.size()==0)return null;
        ListNode head = new ListNode(list.get(0));
        ListNode tail = head;

        for (int i = 1; i < list.size(); i++) {
            tail.next = new ListNode(list.get(i));
            tail = tail.next;
        }
        return head;
    }
    public static ListNode sortList(ListNode head) {
        ArrayList<Integer>list = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(list);
        System.out.println(list);
        return build(list);
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer>list=new ArrayList<>();
        ListNode temp1= list1;
        ListNode temp2 = list2;
        while(temp1!=null){
            list.add(temp1.val);
            temp1=temp1.next;
        }
        while(temp2!=null){
            list.add(temp2.val);
            temp2=temp2.next;
        }
        Collections.sort(list);
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
        int[]arr = {4,2,1,3};
        ListNode head = buildll(arr);
        System.out.println(sortList(head));
    }
}
