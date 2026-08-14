package linked_list;

import java.util.*;

public class removeDuplicate {
    public static class ListNode{
        ListNode next;
        int val;
        ListNode(int val){
            this.val=val;
        }
    }
    public static ListNode build(ArrayList<Integer>list){
        if(list.size()==0)return null;
        ListNode head = new ListNode(list.get(0));
        ListNode tail = head;
        for(int i=1;i<list.size();i++){
            tail.next=new ListNode(list.get(i));
            tail=tail.next;
        }
        return head;
    }
    public static ListNode deleteDuplicates(ListNode head) {
        HashMap<Integer,Integer>map = new HashMap<>();
        ListNode curr = head;
        while(curr!=null){
            map.put(curr.val,map.getOrDefault((curr.val),0)+1);
            curr=curr.next;
        }
        ArrayList<Integer>ans = new ArrayList<>();
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()==1){
                ans.add(entry.getKey());
            }
        }
        System.out.println(ans);
        System.out.println(map);
        return build(ans);
    }
    public static ListNode buildLL(int[]arr){
        if(arr.length==0)return null;
        ListNode head = new ListNode(arr[0]);
        ListNode tail = head;
        for(int i=1;i<arr.length;i++){
            tail.next=new ListNode(arr[i]);
            tail=tail.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int[]head1 = {1,2,3,3,4,4,5};
        ListNode head=buildLL(head1);
        System.out.println(deleteDuplicates(head));
    }
}
