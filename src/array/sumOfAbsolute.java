package array;

import java.util.Arrays;

public class sumOfAbsolute {
    public static int[] getSumAbsoluteDifferences(int[] nums) {
        int[]ans = new int[nums.length];
        int idx=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=0;j<nums.length;j++){
                sum+=Math.abs(nums[i]-nums[j]);
            }
            ans[idx++]=sum;
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }

    public static void main(String[] args) {
        int[] nums={2,3,5};
        System.out.println(getSumAbsoluteDifferences(nums));
    }
}
