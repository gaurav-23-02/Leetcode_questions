package TCSNQTPYQ;

import java.util.*;

public class armStrongNumber {
    public static boolean armStrong(int n){
        int sum=0;
        int x2=n;
        while(n>0){
            int x=0;
            x=n%10;
            sum+=x*x*x;
            n/=10;
        }
        System.out.println(sum);
        if(sum==x2){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(armStrong(n));
    }
}
