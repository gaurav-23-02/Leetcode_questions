package linked_list;

import java.util.ArrayList;
import java.util.Collections;

public class addTwoNumbers {
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
        ListNode tail  = head;
        for(int i=1;i<list.size();i++){
            tail.next=new ListNode(list.get(i));
            tail=tail.next;
        }
        return head;
    }
    public static ListNode swapNodes(ListNode head, int k) {
        int count=0;
        ArrayList<Integer>list = new ArrayList<>();
        ListNode curr = head;
        while(curr!=null){
            list.add(curr.val);
            if(curr.val==k){
                count++;
            }
            curr=curr.next;
        }
        if(count>2){
            return head;
        }
        int temp=0;
        int a=list.get(k);
        int b=list.get(list.size()-k);
        Collections.swap(list,k-1,list.size()-k);
        return head;
    }
    public static ListNode buildLL(int[]arr){
        if(arr.length==0)return null;
        ListNode head =  new ListNode(arr[0]);
        ListNode tail = head;
        for(int i=1;i<arr.length;i++){
            tail.next=new ListNode(arr[i]);
            tail=tail.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int[]head1={1,2,3,4,5};
        ListNode head = buildLL(head1);
        System.out.println(swapNodes(head,2));
    }
}
