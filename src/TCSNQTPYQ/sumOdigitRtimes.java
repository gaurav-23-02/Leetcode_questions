package TCSNQTPYQ;
import java.util.*;
public class sumOdigitRtimes {
    public static int sumOfDigits(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public static int sumOfDigitR(int n,int r){
        int x=sumOfDigits(n);
        for(int i=0;i<r;i++){
            x+=x;
        }
        return sumOfDigits(x);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int r  =sc.nextInt();
        System.out.print(sumOfDigitR(n,r));
    }
}
