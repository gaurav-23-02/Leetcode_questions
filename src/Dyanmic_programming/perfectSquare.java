package Dyanmic_programming;

import java.util.ArrayList;
import java.util.Arrays;

public class perfectSquare {
    public static int square(int n){
        int[]dp = new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        for(int i=1;i<dp.length;i++){
            dp[i]=i;
            for(int j=1;j*j<=i;j++){
                int curr = 1+dp[i-j*j];
                dp[i]=Math.min(dp[i],curr);
            }
        }
        System.out.println(Arrays.toString(dp));
        return dp[n];
    }
    public static int helper(int n){
        if(n==0)return 0;
        int min=Integer.MAX_VALUE;
        for(int i=1;i*i<=n;i++){
            int curr =1+helper(n-i*i);
            min=Math.min(min,curr);
        }
        return min;
    }
    public static int square1(int n){
         return helper(n);
    }
    public static void main(String[] args) {
        int n =12;
        System.out.println(square(n));
        System.out.println(square1(n));
    }
}
