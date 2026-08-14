package TCSNQTPYQ;

import java.util.Scanner;

public class zeroAtlast {
    public static void choclate(int[]nums){
        int[]ans = new int[nums.length];
        int idx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                ans[idx++]=nums[i];
            }
        }
        for(int i=idx;i<ans.length;i++){
            ans[i]=0;
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]nums=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        choclate(nums);
    }
}
