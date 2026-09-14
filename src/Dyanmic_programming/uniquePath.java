package Dyanmic_programming;

import java.util.Arrays;

public class uniquePath {
    public static int Unique(int m,int n,int[][]dp){
        if(m==0&&n==0)return 1;
        if(m<0||n<0)return 0;
        if(dp[m][n]==-1){
            int  up = Unique(m-1,n,dp);
            int left = Unique(m,n-1,dp);
            return dp[m][n]=up+left;
        }
        return dp[m][n];
    }
    public static void main(String[] args) {
        int m=2;
        int n=7;
        int[][]dp= new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        System.out.println(Arrays.deepToString(dp));
        System.out.println(Unique(m-1,n-1,dp));
    }
}
