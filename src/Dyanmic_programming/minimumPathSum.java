package Dyanmic_programming;

import java.util.Arrays;

public class minimumPathSum {
    public static int helper(int[][]grid,int m,int n,int[][]dp){
        if(m==0&&n==0)return grid[0][0];
        if(m<0||n<0)return Integer.MAX_VALUE;
        if(dp[m][n]==-1){
            int up=helper(grid,m-1,n,dp);
            int lef=helper(grid,m,n-1,dp);
            return grid[m][n]+Math.min(up,lef);
        }
        return dp[m][n];

    }
    public static int  minPathIterative(int[][]grid,int m,int n){
        int[][]dp=new int[m+1][n+1];
        dp[0][0]= grid[0][0];

        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0&&j==0){
                    continue;
                }
                int up=Integer.MAX_VALUE;
                int left=Integer.MAX_VALUE;
                if(i>0){
                    up=grid[i][j]+dp[i-1][j];
                }
                if(j>0){
                    left=grid[i][j]+dp[i][j-1];
                }
                dp[i][j]=Math.min(left,up);
            }
        }
        System.out.println(Arrays.deepToString(dp));
        return dp[m][n];

    }
    static int minPathSum(int[][]grid){
        int m=grid.length-1;
        int n=grid[0].length-1;
        int[][]dp = new int[m+1][n+1];
        for(int i=0;i<m+1;i++){
            Arrays.fill(dp[i],-1);
        }
        System.out.println(Arrays.deepToString(dp));
        System.out.println(minPathIterative(grid,m,n));
        return helper(grid,m,n,dp);
    }
    public static void main(String[] args) {
        int[][]grid={{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minPathSum(grid));

    }
}
