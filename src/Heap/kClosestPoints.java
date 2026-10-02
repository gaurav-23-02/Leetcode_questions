package Heap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class kClosestPoints {
    public static class Pair{
        int[]nums;
        int val;
        Pair(int[]nums,int val){
            this.nums=nums;
            this.val=val;
        }
    }
    public static int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair>heap = new PriorityQueue<>((a,b)->Integer.compare(a.val,b.val));
        for(int i=0;i<points.length;i++){
            int x=points[i][0];
            int y=points[i][1];
            int distance = (x*x)+(y*y);
            heap.add(new Pair(points[i],distance));
        }
        int[][]ans = new int[2][k];
        int idx=0;
        while(k!=0){
            Pair x=heap.poll();
            int[]x1=x.nums;
            ans[idx++]=x1;
            k--;
        }
        return ans;
    }


    public static void main(String[] args) {
        int[][]points={{3,3},{5,-1},{-2,4}};
        int k=2;
        System.out.println(Arrays.deepToString(kClosest(points,k)));
    }
}
