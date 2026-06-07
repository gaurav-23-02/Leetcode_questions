package Dyanmic_programming;

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

    public static void main(String[] args) {
        int[]cost={1,2,10,1,1,5};
        System.out.println(climb(cost));
    }
}
