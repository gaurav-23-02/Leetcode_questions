package Heap;

import java.util.PriorityQueue;

public class takeGifts {
    public static long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer>heap = new PriorityQueue<>((a,b)->Integer.compare(b,a));
        for(int i=0;i<gifts.length;i++){
            heap.add(gifts[i]);
        }
        for(int i=0;i<k;i++){
            double x = heap.poll();
            x = Math.pow(x+0.0,0.5);
            heap.add((int)x);
        }
        long sum=0;
        for(int x:heap){
            sum+=x;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[]gifts={25,64,9,4,100};
        System.out.println(pickGifts(gifts,4));
    }
}
