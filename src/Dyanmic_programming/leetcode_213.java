package Dyanmic_programming;

import java.util.ArrayList;

public class leetcode_213 {
    public static int helper(int[]nums,int start,int end){
        ArrayList<Integer>dp = new ArrayList<>();
        dp.add(0);
        dp.add(nums[start]);
        for(int i=start+1;i<=end;i++){
            dp.add(Math.max(
                    dp.get(dp.size()-1),
                    dp.get(dp.size()-2)+nums[i]
            ));
        }
        return dp.get(dp.size()-1);
    }
    public  static int rob2(int[]nums){
        return Math.max(helper(nums,0,nums.length-2),helper(nums,1,nums.length-1));
    }
    public static void main(String[] args) {
        int[]nums={2,3,2};
        System.out.println(rob2(nums));
    }
}
