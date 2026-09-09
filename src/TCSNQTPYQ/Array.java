package TCSNQTPYQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Array {
    public static int info(int[]nums){
        ArrayList<Integer>list = new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                list.add(nums[i]);
            }
        }
        System.out.println(list);
        return 1;
    }
    public static void main(String[] args) {
        int[]nums={1,2,2,1};
        System.out.println(info(nums));
    }
}
