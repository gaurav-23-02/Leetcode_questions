package Dyanmic_programming;

import java.util.Arrays;

public class rob {
    public static int helper(int i,int[]houses,int[]dp){
        if(i==0){
            return houses[0];
        }
        if(i<0)return 0;
        if(dp[i]==-1){
            int pick=houses[i]+helper(i-2,houses,dp);
            int notPick=0+helper(i-1,houses,dp);
            return dp[i]=Math.max(pick,notPick);
        }
        return dp[i];
    }
    public static int rob(int[]houses){
        int[]dp=new int[houses.length+1];
        Arrays.fill(dp,-1);
        int i=houses.length;
        return helper(i-1,houses,dp);
    }
    public static void main(String[] args) {
        int[]houses={2,7,9,3,1};
        System.out.println(rob(houses));
    }
}
