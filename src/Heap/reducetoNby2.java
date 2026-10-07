package Heap;

import java.util.HashMap;
import java.util.PriorityQueue;

public class reducetoNby2 {
    public static int minSetSize(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int n=nums.length;
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b)->Integer.compare(b,a));
        for(int x:map.values()){
            heap.add(x);
        }
        System.out.println(heap);
        int count=0;
        int fulln=n/2;
        while(n>=(n/2)&&!heap.isEmpty()){
            int x=heap.poll();
            n-=x;
            System.out.println(n);
            if(n<=(fulln/2))break;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[]nums={3,3,3,3,5,5,5,2,2,7};
        System.out.println(minSetSize(nums));
    }
}
