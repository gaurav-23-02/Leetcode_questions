package hashmap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

public class Leetcode_2215 {
    static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer>ans1 = new ArrayList<>();
        List<Integer>ans2 = new ArrayList<>();
        Stack<Integer> set1= new Stack<>();
        Stack<Integer>set2= new Stack<>();
        for(int x:nums2){
            set1.add(x);
        }
        for(int x:nums1){
            if(!set1.contains(x)){
                ans1.add(x);
            }
        }
        for(int x:nums1){
            set2.add(x);
        }
        for(int x:nums2){
            if(!set2.contains(x)){
               ans2.add(x);
            }
        }

        ans.add(ans1);
        ans.add(ans2);
        return ans;

    }
    public static void main(String[] args) {
        int[]nums1 = {1,2,3,3}; int[]nums2 = {1,1,2,2};
        System.out.println(findDifference(nums1,nums2));
    }
}
