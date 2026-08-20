package TCSNQTPYQ;

import java.util.Scanner;

public class exam {
    public static int song(int n,int m){
        int x=n+1;
        if(x>15){
            x=15;
        }
        while(m!=0){
            x-=1;
            m--;
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m=sc.nextInt();
        System.out.println(song(n,m));
    }
}
