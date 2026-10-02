package Stacks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class nextGreater1 {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer>st = new Stack<>();
        int[]ans=new int[nums2.length];
        for(int i=nums2.length-1;i>=0;i--){
            if(st.isEmpty()||nums2[i]>st.peek()){
                ans[i]=-1;
                st.push(nums2[i]);
            }
            if(st.peek()>nums2[i]){
                ans[i]=st.peek();
                st.push(nums2[i]);
            }
        }
        System.out.println(Arrays.toString(ans));
        HashMap<Integer,Integer>map= new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            map.put(nums2[i],ans[i]);
        }
        int []realAns=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            realAns[i]=map.get(nums1[i]);
        }
        return realAns;
    }

    public static void main(String[] args) {
        int[]nums1={4,1,2};
        int[]nums2={1,3,4,2};
        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));
    }
}
