package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class leetcode_3069 {
    public static int[] resultArray(int[] nums) {
        Stack<Integer>st1=new Stack<>();
        Stack<Integer>st2=new Stack<>();
        st1.push(nums[0]);
        st2.push(nums[1]);
        for(int i=2;i<nums.length;i++){
            if(st1.peek()>st2.peek()){
                st1.add(nums[i]);
            }
            else{
                st2.push(nums[i]);
            }
        }
        Stack<Integer>buffer=new Stack<>();
        System.out.println(st1);
        System.out.println(st2);
        int idx=0;
        for(int x:st1){
            buffer.push(x);
        }
        for(int x:buffer){
            nums[idx++]=x;
        }
        Stack<Integer>buffer2=new Stack<>();
        for(int x:st2){
            buffer2.add(x);
        }
        for(int x:buffer2){
            nums[idx++]=x;
        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }
    public static void main(String[] args) {
        int[]nums={5,4,3,8};
        System.out.println(resultArray(nums));
    }
}
