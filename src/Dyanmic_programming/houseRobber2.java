package Dyanmic_programming;
import java.util.*;
public class houseRobber2 {
    public static int rob(int[]nums){
        ArrayList<Integer>dp = new ArrayList<>();
        dp.add(nums[0]);
        dp.add(Math.max(nums[0],nums[1]));
        for(int i=2;i<nums.length;i++){
            dp.add(Math.max(dp.get(dp.size()-2)+nums[i],dp.get(dp.size()-1)));
        }
        return dp.get(dp.size()-1);
    }
    public static int rob1(int[]nums){
        int p1 = nums[0];
        int p2 = Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++) {
            int current = Math.max(nums[i] + p2, p1);
            p1 = p2;
            p2 = current;
        }
        return p1;
    }


    public static void main(String[] args) {
        int[]nums={2,7,9,3,1};
        System.out.println(rob(nums));
        System.out.println(rob1(nums));
    }
}
