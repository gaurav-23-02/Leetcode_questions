package slidingWindow;

public class leetcode_209 {
    public static int minSubArrayLen(int target, int[] nums) {
        int windowStart=0;
        int windowEnd=0;
        int sum=0;
        int minLen=Integer.MAX_VALUE;
        int len=0;
        while(windowEnd<nums.length){
            sum+=nums[windowEnd];
            if(sum>=target){
                len =windowEnd-windowStart+1;
                minLen=Math.min(minLen,len);
                while(windowStart<windowEnd&&sum>target){
                    sum-=nums[windowStart];
                    windowStart++;
                    if(sum>=target){
                        len=windowEnd-windowStart+1;
                        minLen=Math.min(len,minLen);

                    }
                }
            }
            windowEnd++;
        }
        if(minLen==Integer.MAX_VALUE){
            return minLen;
        }
        return minLen;
    }

    public static void main(String[] args) {
        int[]nums={2,3,1,2,4,3};
        int target =7;
        System.out.println(minSubArrayLen(target,nums));
    }
}
