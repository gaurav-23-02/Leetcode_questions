package Heap;

import java.util.*;

public class multiplicationStateAfterK {
    public static int largestNumber(int[] nums,int k) {
        Arrays.sort(nums);
        int negativeCount=0;

        for(int x:nums){
            if(x<0){
                negativeCount++;
            }
        }
        if(negativeCount>k){
            for(int i=0;i<nums.length;i++){
                int x=nums[i];
                x*=-1;
                nums[i]=x;
                k--;
                if(k==0)break;
            }
        }
        else{
            while(k!=0){
                int x=nums[0];
                x*=-1;
                nums[0]=x;
                k--;
            }
        }
        int sum=0;
        for(int x:nums){
            sum+=x;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] nums = {2,-3,-1,5,-4};
        int[]nums1={4,2,3};
        System.out.println(largestNumber(nums,2));
        System.out.println(largestNumber(nums1,1));

    }
}
