package array;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math.*;

public class tcsNqt {
    public static void closestNumber(int[]arr,int closeset){
        if(arr[0]>closeset){
            System.out.println("The closest number to "+closeset+" is not available");
        }
        int x = Integer.MAX_VALUE;
        int i=0;
        int z=-1;
        while(arr[i]<=closeset){
            z=arr[i];
            i++;
        }
        System.out.println("The closest number to "+closeset+ " is "+z);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the closest number");
        int closest = sc.nextInt();
        closestNumber(arr,closest);
    }
}
