package TCSNQTPYQ;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class makeArrayEqual {
    public static int maximumProduct(int[] nums, int k) {
        PriorityQueue<Integer>heap = new PriorityQueue<>();
        for(int x:nums){
            heap.add(x);
        }
        while(k!=0){
            int x=heap.poll();
            heap.add(x+1);
            k--;
        }
        int max=1;
        for(int x:heap){
            max*=x;
        }
        return max;
    }

    public static void main(String[] args) {
        int[]nums={6,3,3,2};
        int k=2;
        System.out.println(maximumProduct(nums,k));
    }

}
