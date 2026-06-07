package BitManipulation;

import java.util.Scanner;

public class checkPowOf2 {
    public static boolean pow2(int n){
        String s =Integer.toBinaryString(n);
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
            }
        }
        if(count==1){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean fastpow2(int n){
        if((n & (n-1))==0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(pow2(n));
        System.out.println(fastpow2(n));
    }
}
