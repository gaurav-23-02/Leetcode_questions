package GreedyAlgo;

public class jumpGame {
    public static boolean canJump(int[] nums) {
        int sum=nums[0];
        int idx=0;
        for(int i=0;i<nums.length;i++){
            idx+=nums[i];
            i=idx;
            System.out.println(idx);
        }
        if(idx>=nums.length-1){
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        int[]nums={2,3,1,1,4};
        int[]nums1={3,2,1,0,4};
        System.out.println(canJump(nums1));
        System.out.println(canJump(nums));
    }
}
