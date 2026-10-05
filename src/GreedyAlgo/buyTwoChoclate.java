package GreedyAlgo;

import java.util.PriorityQueue;

public class buyTwoChoclate {
    public static int buyChoco(int[] prices, int money) {
        int z=money;
        PriorityQueue<Integer>heap = new PriorityQueue<>();
        for(int x:prices){
            heap.add(x);
        }
        for(int i=0;i<2;i++){
            int x=heap.poll();
            money-=x;
        }
        if(money>0)return money;
        if(money==0)return 0;
        return z;
    }
    public static void main(String[] args) {
        int[]prices={98,54,6,34,66,63,52,39};
        int money=62;
        System.out.println(buyChoco(prices,money));
    }
}
