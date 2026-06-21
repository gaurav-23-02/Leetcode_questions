package Heap;

import java.util.Arrays;

public class mostCommon {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int sum=0;
        int idx=0;
        int count=0;
        while (sum<coins){
            sum+=costs[idx++];
            count++;
            if(count==costs.length){
                return count;
            }
        }
        return count;
    }

    public static void main(String[] args){
        int[] costs={1,3,2,4,1};
        int coins=7;
        mostCommon obj = new mostCommon();
        System.out.println(obj.maxIceCream(costs,coins));
    }
}
