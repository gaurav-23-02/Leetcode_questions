package Dyanmic_programming;

import java.util.Arrays;

public class frogJump {
    public static int helper(int i,int[]heights,int[]dp){
        if(i==0)return 0;
        if(dp[i]==-1){
            int left=helper(i-1,heights,dp)+Math.abs(heights[i]-heights[i-1]);
            int right =Integer.MAX_VALUE;
            if(i>1){
                right= helper(i-2,heights,dp)+Math.abs(heights[i]-heights[i-2]);
            }
            return dp[i]= Math.min(left,right);
        }
        else{
            return dp[i];
        }
    }
    static int minCostBottomUp(int[]heights){
        int[]dp = new int[heights.length];
        Arrays.fill(dp,-1);
        dp[0]=0;
        for(int i=1;i<heights.length;i++){
            int fs=dp[i-1]+Math.abs(heights[i]-heights[i-1]);
            int ss=Integer.MAX_VALUE;
            if(i>1){
                ss=dp[i-2]+Math.abs(heights[i]-heights[i-2]);
            }
            dp[i]=Math.min(fs,ss);
        }
        return dp[heights.length-1];
    }
    static int minCost(int[]heights){
        int[]dp = new int[heights.length+1];
        Arrays.fill(dp,-1);
        return helper(heights.length-1,heights,dp);
    }
    public static void main(String[] args) {
        int[]heights={20,30,40,20};
        //Express it is in index based

        //Do all stuffs on that index

        //A/q take the minimum of all the stuffs

        System.out.println(minCost(heights));
        System.out.println(minCostBottomUp(heights));
    }
}
