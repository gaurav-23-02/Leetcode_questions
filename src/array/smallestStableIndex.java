package array;

import java.util.Arrays;

public class smallestStableIndex {
    public static int findMin(int[]nums,int k){
        int n=nums.length;
        int[]max=new int[nums.length];
        int[]min=new int[nums.length];
        max[0]=Math.max(nums[0],nums[1]);
        for(int i=1;i<nums.length;i++){
            max[i]=Math.max(max[i-1],nums[i]);
        }
        min[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            min[i]=Math.min(min[i+1],nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(max[i]-min[i]<=k){
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] nums={5,0,1,4};
        int k=3;
        System.out.println(findMin(nums,k));
    }
}
