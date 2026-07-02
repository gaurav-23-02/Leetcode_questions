package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Leetcode2148 {
    public static int countElements(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i-1]<nums[i]&&nums[nums.length-1]>nums[i]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums={-71,-71,93,-71,40};
        System.out.println(countElements(nums));
    }
}
