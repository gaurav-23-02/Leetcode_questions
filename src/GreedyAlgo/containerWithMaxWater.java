package GreedyAlgo;

import java.util.Collections;
import java.util.PriorityQueue;

public class containerWithMaxWater {
    static int maxArea(int[] height) {
        PriorityQueue<Integer>heap = new PriorityQueue<>(Collections.reverseOrder());
        int n=height.length;
        if(n%2==0){
            for(int i=0;i<n/2;i++){
                heap.add(height[i]);
            }
            int r=heap.peek();
            while(!heap.isEmpty())heap.poll();
            for(int i=n/2;i<n;i++){
                heap.add(height[i]);
            }
            int l=heap.peek();
            int ans =Math.min(r,l);
            return ans*ans;
        }
        else{
            for(int i=0;i<(n/2)+1;i++){
                heap.add(height[i]);
            }
            int r=heap.peek();
            while(!heap.isEmpty())heap.poll();
            for(int i=(n/2)+1;i<n;i++){
                heap.add(height[i]);
            }
            int l=heap.peek();
            int ans =Math.min(r,l);
            return ans*ans;
        }
    }
    public static void main(String[] args) {
        int[]height={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
