package array;

import java.util.Arrays;

import java.util.*;

public class thirrdMax {
    public static int thirdMax(int[] nums) {
        int max=0;
        int currMax=0;
        for(int i=0;i<nums.length-1;i++){
            currMax=nums[i]*nums[i+1];
            if(currMax>max){
                max=currMax;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[]nums={-1,4,-4,5,-2,-1,-1,-2,-3};
        System.out.println(thirdMax(nums));
    }
}
