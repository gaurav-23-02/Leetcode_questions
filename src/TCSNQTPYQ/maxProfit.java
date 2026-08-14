package TCSNQTPYQ;
import java.util.*;
public class maxProfit {
    public static int max(int[]nums){
        int max=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                max=Math.max(nums[j]-nums[i],max);
            }
        }
        return max;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(max(nums));
    }
}
