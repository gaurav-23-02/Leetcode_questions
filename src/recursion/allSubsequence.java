package recursion;

import java.util.ArrayList;
import java.util.List;

public class allSubsequence {
    public static void helper(List<List<Integer>>ss,int[]nums,int i,List<Integer>curr){
        if(i==nums.length){
            ss.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[i]);
        helper(ss,nums,i+1,curr);
        curr.remove(curr.size()-1);
        helper(ss,nums,i+1,curr);
    }
    public static void subSeq(int[]nums){
        List<List<Integer>> ss = new ArrayList<>();
        helper(ss,nums,0,new ArrayList<>());
        System.out.println(ss);
    }
    public static void main(String[] args) {
        int[] nums={3,2,1};
        subSeq(nums);


    }
}
