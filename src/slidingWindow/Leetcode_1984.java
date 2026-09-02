package slidingWindow;

import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode_1984 {
    static int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int high=k-1;
        int low=0;
        while(high<nums.length){
            int currDiff=nums[high]-nums[low];
            min=Math.min(currDiff,min);
            high++;
            low++;
        }
        return min;
    }
    public static void main(String[] args) {
        int[]arr={86,85,74,62,43,27,15,12,3};
        System.out.println(minimumDifference(arr,4));
    }
}
