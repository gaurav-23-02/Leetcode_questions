package BinarySearch;

import java.util.Arrays;

public class firstandLastOccurence {
    public static int[] binary(int[]nums,int target){
        int[]ans = new int[2];
        ans[0]=-1;
        ans[1]=-1;
        int low =0;
        int high=nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==target){
                ans[0]=mid;
                 while(mid<nums.length&&nums[mid]==target){
                    ans[1]=mid;
                    mid++;
                }
                break;
            }
            if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]nums={3,10,30,30,30,30,40};
        System.out.println(Arrays.toString(binary(nums,30)));
    }
}
