package Dyanmic_programming;

public class tabulation_fibo {
    public static int nthFibo(int n){
        int[] dp=new int[n+1];
        dp[0]=0;
        if(n>=1)dp[1]=1;
        for(int i=2;i<dp.length;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(nthFibo(07));
    }
}
