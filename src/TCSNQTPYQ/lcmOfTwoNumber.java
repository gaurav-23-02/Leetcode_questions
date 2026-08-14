package TCSNQTPYQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class lcmOfTwoNumber {
    public static int lcm(int n,int m) {
        int max = Math.max(n,m);
        while(true){
            if(max%n==0&&max%m==0){
                return max;
            }
            max++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m = sc.nextInt();
        System.out.println(lcm(n,m));
    }
}
