package Strings;

import java.util.Stack;

public class StringMatching {
    public static boolean isMonotonic(int []nums){
        Stack<Integer>st = new Stack<>();
        if(nums[0]>nums[nums.length-1]){
            for(int i=0;i<nums.length;i++){
                if(st.empty()){
                    st.push(nums[i]);
                }
                else if(st.peek()<=nums[i]){
                    st.push(nums[i]);
                }
                else {
                    return false;
                }
            }
            return true;
        }
        if(nums[0]<nums[nums.length-1]){
            for(int i=0;i>nums.length;i++){
                if(st.empty()){
                    st.push(nums[i]);
                }
                else if(st.peek()<=nums[i]){
                    st.push(nums[i]);
                }
                else {
                    return false;
                }
            }
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        int[]nums={1,2,2,3};
        int[]nums1={6,5,5,4};
        int[]nums2={1,3,2};
        System.out.println(isMonotonic(nums));
        System.out.println(isMonotonic(nums1));
        System.out.println(isMonotonic(nums2));
    }

}
