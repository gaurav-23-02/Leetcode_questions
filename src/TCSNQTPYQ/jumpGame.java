package TCSNQTPYQ;

import java.util.Scanner;

public class jumpGame {
    public static boolean jump(int[]nums){
        for(int i=0;i<nums.length;i++){
            if(i+nums[i]>=nums.length){
                return true;
            }
        }
        return false;
    }
    public static void main(String []args){
        Scanner sc =  new Scanner(System.in);
        int n= sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(jump(nums));
    }
}
