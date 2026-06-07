package Dyanmic_programming;

public class nthFibo_spaceOptimization {
    static int[]dp;
    public static int fiboSpace(int n){
        int[]dp=new int[3];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[2]=dp[1]+dp[0];
            dp[0]=dp[1];
            dp[1]=dp[2];
        }return dp[2];
    }

    public static void main(String[] args) {
        System.out.println(fiboSpace(6));
    }

}
