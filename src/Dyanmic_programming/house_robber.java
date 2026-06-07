package Dyanmic_programming;

import java.util.Arrays;

public class house_robber {
    static int[]dp;//global variable
    public static int loot(int i,int[] arr){
        if(i>=arr.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int pick =arr[i]+loot(i+2,arr);
        int skip =loot(i+1,arr);
        int ans=Math.max(pick,skip);
        dp[i]=ans;
        return ans;
    }
    public static int findMaxSum(int[]arr){
        int n=arr.length;
        dp=new int[n];
        Arrays.fill(dp,-1);
        return loot(0,arr);

    }

    public static void main(String[] args) {
        int[]arr={6,10,5,2,15};
        System.out.println(findMaxSum(arr));
    }
}
