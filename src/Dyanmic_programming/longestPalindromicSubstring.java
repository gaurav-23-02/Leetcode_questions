package Dyanmic_programming;

import java.util.Arrays;

public class longestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        int[]ans = {0,0};
        boolean[][]dp = new boolean[s.length()][s.length()];
        for(int i=0;i<dp.length;i++){
            dp[i][i]=true;
        }
        for(int i=0;i<dp.length-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                dp[i][i+1]=true;
            }
            ans[0]=i;
            ans[1]=i+1;
        }
        for(int rem=3;rem<=dp.length;rem++){
            for(int i=0;i<dp.length-rem;i++){
                int j=i+rem-1;
                if(s.charAt(i)==s.charAt(j)&&dp[i+1][j-1]){
                    dp[i][j]=true;
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
        return s.substring(ans[0],ans[1]+1);
    }
    public static void main(String[] args) {
        String s ="babad";
        System.out.println(longestPalindrome(s));
    }
}
