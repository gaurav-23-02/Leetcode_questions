package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class nextGreater2 {
    public static int[] nextGreaterElements(int[] nums) {
        Stack<Integer>st = new Stack<>();
        int max=0;
        for(int x:nums){
            max=Math.max(x,max);
        }
        st.push(max);
        int[]ans = new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            if(st.peek()>nums[i]){
                ans[i]=st.peek();
                st.push(nums[i]);
            }
            if(nums[i]>st.peek()){
                ans[i]=-1;
                st.push(nums[i]);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]nums={5,4,3,2,1};
        System.out.println(Arrays.toString(nextGreaterElements(nums)));
    }
}
