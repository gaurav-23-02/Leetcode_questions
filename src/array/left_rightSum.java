package array;

import java.util.Arrays;

public class left_rightSum {
    public  static int[] leftRightDifference(int[] nums) {
        int[]right=new int[nums.length];
        int[]left=new int[nums.length];
        int[]ans=new int[nums.length];
        left[0]=0;
        for(int i=0;i<nums.length-1;i++){
            left[i+1]=nums[i]+left[i];
        }
        right[nums.length-1]=0;
        for(int i=nums.length-1;i>0;i--){
            right[i-1]=nums[i]+right[i];
        }
        for(int i=0;i<nums.length;i++){
            ans[i]=Math.abs(left[i]-right[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int []nums = {10,4,8,3};
        System.out.println(Arrays.toString(leftRightDifference(nums)));

    }

}
