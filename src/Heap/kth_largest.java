package Heap;

import java.util.PriorityQueue;

public class kth_largest {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            if(i<k){
                pq.add(nums[i]);
            }
            else{
                pq.add(nums[i]);
                pq.remove();
            }
        }
        return pq.peek();

    }

    public static void main(String[] args) {
        int []nums = {3,2,3,1,2,4,5,5,6};
        System.out.println(findKthLargest(nums,4));
    }
}
