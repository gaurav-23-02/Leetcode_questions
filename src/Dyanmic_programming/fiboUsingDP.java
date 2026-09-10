package Dyanmic_programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class fiboUsingDP {
    public static int fibo(int n,HashMap<Integer,Integer>store){
         if(n==0||n==1)return n;
         if(!store.containsKey(n)){
             store.put(n,fibo(n-1,store)+fibo(n-2,store));
         }
         return store.get(n);
    }
    public static int helper(int[]dp,int n){
        if(n==1||n==0)return n;
        if(dp[n]==-1){
            dp[n]=helper(dp,n-1)+helper(dp,n-2);
        }
        return dp[n];
    }
    public static int fiboInt(int n){
        int[]dp=new int[n+1];
        Arrays.fill(dp,-1);
        return helper(dp,n);
    }
    public static int fiboIterative(int n){
        ArrayList<Integer>dp = new ArrayList<>();
        dp.add(0);
        dp.add(1);
        for(int i=2;i<=n;i++){
            dp.add(dp.get(i-1)+dp.get(i-2));
        }
        return dp.get(n);
    }
    public static void main(String[] args) {
        int n=6;
        HashMap<Integer,Integer>map = new HashMap<>();
        System.out.println(fibo(n,map));
        System.out.println(map);
        System.out.println(fiboIterative(n));
        System.out.println("Memoization using the dp array");
        System.out.println(fiboInt(6));
    }
}
