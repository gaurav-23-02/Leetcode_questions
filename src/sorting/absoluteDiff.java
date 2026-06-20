package sorting;

import java.util.Arrays;

public class absoluteDiff {
    public static int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int smallSum=0;
        int largeSum=0;
        for(int i=0;i<k;i++){
            smallSum+=nums[i];
        }
        System.out.println(smallSum);
        for(int i=nums.length-1;i>nums.length-k-1;i--){
            largeSum+=nums[i];
        }
        System.out.println(largeSum);
        return Math.abs(largeSum-smallSum);
    }

    public static void main(String[] args) {
        int[] nums={100,100};
        int k=1;
        System.out.println(absDifference(nums,k));
    }
}
