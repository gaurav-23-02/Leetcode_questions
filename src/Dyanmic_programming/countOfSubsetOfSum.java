package Dyanmic_programming;

import java.util.Arrays;

public class countOfSubsetOfSum {
    public static int countSub(int[]nums,int k){
         int n=nums.length;
         int[][]dp =  new int[n+1][k+1];
         for(int i=0;i<n+1;i++){
             for(int j=0;j<k+1;j++){
                 if(i==0) dp[i][j]=0;
                 if(j==0) dp[i][j]=1;
                 if(i>0){
                     if(nums[i-1]<=j){
                         dp[i][j]=dp[i-1][j-nums[i-1]]+dp[i-1][j];
                     }
                     else{
                         dp[i][j]=dp[i-1][j];
                     }
                 }
             }
         }
         for(int i=0;i<dp.length;i++){
             System.out.println(Arrays.toString(dp[i]));
         }
         return dp[n][k];
    }
    public static void main(String[] args) {
        int[]nums={2,3,5,8,10,6};
        int sum=10;
        System.out.println(countSub(nums,sum));
    }
}
