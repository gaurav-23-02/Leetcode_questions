package Dyanmic_programming;

import java.util.ArrayList;
import java.util.HashMap;

public class stairs_tabulation {
    public static int climb(int[]cost){
        int[] dp =new int[cost.length];
        dp[0]=cost[0];
        dp[1]=cost[1];
        for(int i=2;i<cost.length;i++){
            dp[i]=cost[i]+Math.min(dp[i-1],dp[i-2]);
        }
        return Math.min(dp.length-1,dp.length-2);
    }

    public static int climb1(int[]costs){
        ArrayList<Integer>dp= new ArrayList<>();
        dp.add(costs[0]);
        dp.add(costs[1]);
        for(int i=2;i<costs.length;i++){
            dp.add(costs[i]+Math.min(dp.get(i-1),dp.get(i-2)));
        }
        System.out.println("DP ARRAY"+dp);
        return Math.min(dp.get(dp.size()-1),dp.get(dp.size()-2));
    }

    public static void main(String[] args) {
        HashMap<Integer,Integer>map =  new HashMap<>();
        int[]cost={10,15,20};
        System.out.println(climb1(cost));
        System.out.println(climb(cost));
    }
}
