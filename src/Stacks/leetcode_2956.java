package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class leetcode_2956 {
    static int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Stack<Integer>num1=new Stack<>();
        Stack<Integer>num2=new Stack<>();
        for(int x:nums1){
            num1.add(x);
        }
        int countAns1=0;
        for(int x:nums2){
            if(num1.contains(x)){
                countAns1++;
            }
        }
        for(int x:nums2){
            num2.add(x);
        }
        int countAns2=0;
        for(int x:nums1){
            if(num2.contains(x)){
                countAns2++;
            }
        }
        return new int[]{countAns2,countAns1};
    }

    public static void main(String[] args) {
        int[]nums1={2,3,2};
        int[]nums2={1,2};
        System.out.println(Arrays.toString(findIntersectionValues(nums1,nums2)));
    }
}
