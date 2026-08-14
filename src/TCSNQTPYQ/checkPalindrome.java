package TCSNQTPYQ;

import java.util.Scanner;

public class checkPalindrome {
    public static boolean checkPalin(int n){
        StringBuilder ans = new StringBuilder(n+"");
        String s = n+"";
        String x =ans.reverse().toString();
        if(s.equals(x)){
            return true;
        }
        return false;
    }
    public static int check(int n,int m){
        int count=0;
        for(int i=n;i<=m;i++){
            if(checkPalin(i)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m=sc.nextInt();
        System.out.println(check(n,m));
    }
}
