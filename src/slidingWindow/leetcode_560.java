package slidingWindow;

public class leetcode_560 {
    //here we have to find the subarray which is equal to k with dynamically sliding the window from m sizes
    public static int subarraySum(int[] nums, int k) {
        int left=0;
        int sum=0;
        int windowSize=0;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while (sum>k){
                sum-=nums[left];
                left++;
            }
            if(sum==k){
                windowSize=Math.max(windowSize,right-left+1);
            }
        }
        return windowSize;
    }

    public static void main(String[] args) {
        int[]nums={4,1,1,1,2,3,5};
        System.out.println(subarraySum(nums,5));
    }
}
