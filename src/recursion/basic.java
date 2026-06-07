package recursion;

import java.util.Scanner;

public class basic {
    static int n;//Global variable can be accessed anywhere in the program


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        print(1);
        System.out.println();
        printRev(n);
    }

    public static void print(int x){
        if(x>n) return;
        System.out.print(x+" ");
        print(x+1);
    }

    public static void printRev(int n){
        if(n==0) return;
        System.out.print(n+" ");
        printRev(n-1);
    }
}
