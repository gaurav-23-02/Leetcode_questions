package Dyanmic_programming;

import java.util.Arrays;

public class perfectSquare_memoization {
    public static int square(int n){
        if(n==0)return 0;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        if(dp[n]!=-1){
            return dp[n];
        }
        int min = Integer.MAX_VALUE;
        for(int i=1;i*i<=n;i++){
            int curr = 1+ square(n-i*i);
            min=Math.min(min,curr);
        }
        return dp[n]=min;
    }
    public static void main(String[] args) {
        int n=12;
        System.out.println(square(n));
    }
}
