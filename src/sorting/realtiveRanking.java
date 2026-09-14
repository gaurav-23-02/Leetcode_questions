package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class realtiveRanking {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
        }
    }
    public static ListNode buildll(List<Integer>head1){
        if(head1.size()==0)return null;
        ListNode head = new ListNode(head1.get(0));
        ListNode tail = head;
        for(int i=1;i<head1.size();i++){
            tail.next=new ListNode(head1.get(i));
            tail=tail.next;
        }
        return head;
    }
    static ListNode mergeNodes(ListNode head) {
        ArrayList<Integer>list = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        List<Integer>ans = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(list.get(i)==0){
                int sum=0;
                i++;
                while(i<list.size() && list.get(i)!=0){
                    sum+=list.get(i);
                    i++;
                }
                if(i<list.size()){
                    ans.add(sum);
                }
                i--;
            }
        }
        System.out.println(ans);
        System.out.println(list);
        return buildll(ans);
    }
    public static ListNode buildLL(int[]head1){
        if(head1.length==0)return null;
        ListNode head = new ListNode(head1[0]);
        ListNode tail = head;
        for(int i=1;i<head1.length;i++){
            tail.next = new ListNode(head1[i]);
            tail=tail.next;
        }
        return head;

    }
    public static void main(String[] args) {
        int[] head1={0,3,1,0,4,5,2,0};
        ListNode head = buildLL(head1);
        System.out.println(mergeNodes(head));


    }

}
