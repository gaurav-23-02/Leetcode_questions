package slidingWindow;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class leetcode_239 {

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[]ans = new int[nums.length-k+1];
        int max=nums[0];
        for(int i=0;i<k;i++){
            max=Math.max(nums[i],max);
        }
        int idx=0;
        ans[idx++]=max;
        for(int i=k;i<nums.length;i++){
            if(nums[i-k]==max){
                max=nums[i-k+1];
                for(int j=i-k+1;j<=i;j++){
                    max=Math.max(max,nums[j]);
                }
            }
            else{
                max=Math.max(nums[i],max);
            }
            ans[idx++]=max;
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }
    public static void main(String[] args) {
        int[]nums={1,3,-1,-3,5,3,6,7};
        System.out.println(maxSlidingWindow(nums,3));
    }
}
