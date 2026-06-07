package Dyanmic_programming;

import java.util.Arrays;

public class climing_stairs {
    static int[]dp;//global variable
    public static int helper(int i,int[] arr){
        if(i>=arr.length) return 0;
        return arr[i]+Math.min(helper(i+1,arr),helper(i+2,arr));
    }
    public static int clibing(int[]arr){
        int n=arr.length;
        dp=new int[n];
        Arrays.fill(dp,-1);
        return Math.min(helper(0,arr),helper(1,arr));
    }

    public static void main(String[] args) {
        int[]arr={10,15,20};
        System.out.println(clibing(arr));
    }
}
