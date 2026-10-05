package GreedyAlgo;

import java.util.Arrays;

public class minOperationForAlternateParity {
    public static int[] makeParityAlternating(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            boolean parityI = false;
            if(nums[i]%2==0&&nums[i+1]%2==0){
                parityI=true;
            }
            else if(nums[i]%2!=0&&nums[i+1]!=0){
                parityI=true;
            }
            else{
                parityI=false;
            }
            if(parityI){
                nums[i+1]=nums[i+1]-1;
                System.out.println(Arrays.toString(nums));
                count++;
            }
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MIN_VALUE;
        for(int x:nums){
            max=Integer.max(max,x);
        }
        for(int x:nums){
            min=Integer.min(max,x);
        }
        System.out.println(max+" "+min);
        int add=max-(min);
        return new int[]{count,add};
    }
    public static void main(String[] args) {
        int[]nums={-2,-3,1,4};
        System.out.println(Arrays.toString(makeParityAlternating(nums)));
    }
}
