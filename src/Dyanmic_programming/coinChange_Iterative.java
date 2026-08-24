package Dyanmic_programming;

import java.util.Arrays;

public class coinChange_Iterative {
    public static int coinChange(int[]coins,int amount){
        int[]dp=new int[amount+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for(int i=1;i<dp.length;i++){
            for(int j=0;j<coins.length;j++){
                if(i-coins[j]>=0){
                    dp[i]=Math.min(dp[i],1+dp[i-coins[j]]);
                }
            }
        }
        System.out.println(Arrays.toString(dp));
        return dp[amount];
    }
    public static void main(String[] args) {
        int[]coins={1,2,5};
        int amount=11;
        System.out.println(coinChange(coins,amount));
    }
}
