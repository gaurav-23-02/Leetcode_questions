package Dyanmic_programming;

public class maxProductSubarray {
    public static int maxProduct(int[] nums) {
        int[]ans = new int[nums.length];
        if(nums[0]==0){
            ans[0]=1;
        }
        else{
            ans[0]=nums[0];
        }
        int max=0;
        for(int i=1;i<nums.length;i++){
            ans[i]=nums[i]*ans[i-1];
            max=Math.max(max,ans[i]);
        }
        return max;
    }
    public static void main(String[] args) {
        int[]nums={2,3,-2,4};
        System.out.println(maxProduct(nums));
    }
}
