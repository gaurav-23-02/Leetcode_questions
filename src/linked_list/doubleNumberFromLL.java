package linked_list;

import java.util.ArrayList;
import java.util.Collections;

public class doubleNumberFromLL {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
            next=null;
        }
    }
    public static void gettingNumber(ListNode head){
        StringBuilder number = new StringBuilder();
        ListNode curr = head;
        while(head!=null){
            number.append(curr.val);
            curr=curr.next;
        }
        int num = Integer.parseInt(number.toString());
        int x =num*2;
        ArrayList<Integer>list=new ArrayList<>();
        String t=x+"";
        for(int i=0;i<t.length();i++){
            list.add(t.charAt(i)-'0');
        }
        System.out.println(x);
        build(list);

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
        int[]head1={1,8,9};

        ListNode heaed =buildll(head1);

    }
}
