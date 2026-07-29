package array;

import java.util.HashMap;

public class closestTozero {
    public static int findClosestNumber(int[] nums) {
        int close=Integer.MAX_VALUE;
        int ans =Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                int x=Math.abs(nums[i]);
                close=Math.min(x,close);
            }
            else{
                close=Math.min(nums[i],close);
            }

        }

        System.out.println(ans);
        return close;
    }

    public static void main(String[] args) {
        int[]nums = {-4,-2,1,4,8};
        System.out.println(findClosestNumber(nums));
    }
}
