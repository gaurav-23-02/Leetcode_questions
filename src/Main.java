import java.util.*;
public class Main {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
        }
    }
    static int[] nodesBetweenCriticalPoints(ListNode head) {
        List<Integer>vals = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            vals.add(temp.val);
            temp=temp.next;
        }
        List<Integer>criticalPoints=new ArrayList<>();
        System.out.println(vals);
        for(int i=1;i<vals.size()-1;i++){
            if(vals.get(i-1)>vals.get(i)&&vals.get(i+1)>vals.get(i)){
                criticalPoints.add((i+1));
            }
            if(vals.get(i-1)<vals.get(i)&&vals.get(i+1)<vals.get(i)){
                criticalPoints.add((i+1));
            }
        }
        if(criticalPoints.size()<2){
            return new int[]{-1,-1};
        }
        Collections.sort(criticalPoints);
        System.out.println(criticalPoints);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<criticalPoints.size()-1;i++){
            min=Math.min(min,criticalPoints.get(i+1)-criticalPoints.get(i));
        }
        int max=criticalPoints.get(criticalPoints.size()-1)-criticalPoints.get(0);
        return new int[]{min,max};
    }
    public static ListNode buildLL(int[]arr){
        ListNode head = new ListNode(arr[0]);
        ListNode tail =head;
        for(int i=1;i<arr.length;i++){
            tail.next=new ListNode(arr[i]);
            tail=tail.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int[]arr={6,8,4,1,9,6,6,10,6};
        ListNode head = buildLL(arr);
        System.out.println(Arrays.toString(nodesBetweenCriticalPoints(head)));
    }
}
