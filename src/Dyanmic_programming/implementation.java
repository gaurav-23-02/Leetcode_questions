package Dyanmic_programming;
public class implementation {
    static int[]dp;
    public static int fibo(int n){
        if(n==0||n==1) return n;
        if(dp[n]!=0)return dp[n];
        int ans=fibo(n-1)+fibo(n-2);
        dp[n]=ans;
        return ans;
    }
    public static int soln(int n){
        dp=new int[n+1];
        return fibo(6);
    }
    public static void main(String[] args) {
        System.out.println(soln(6));
    }
}
