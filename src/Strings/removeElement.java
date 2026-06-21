package Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class removeElement {
    public static int minOperations(int[]nums,int val) {
        ArrayList<Integer>ans=new ArrayList<>();
        int count=0;
        for(int x:nums){
            if(x!=val){
               ans.add(x);
               count++;
            }
        }
        Arrays.fill(nums,0);
        int idx=0;
        for(int x:ans){
            nums[idx++]=x;
        }
        return count;

    }


    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        System.out.println(minOperations(nums,2));;
    }
}
