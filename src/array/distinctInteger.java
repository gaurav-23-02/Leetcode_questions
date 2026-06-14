package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class distinctInteger {
    public static int countDistinctIntegers(int[] nums) {
        ArrayList<Integer>ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            ans.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            StringBuilder s = new StringBuilder();
            s.append(nums[i]);
            String revs=s.reverse().toString();
            int x = Integer.parseInt(revs);
            ans.add(x);
            s.deleteCharAt(0);
        }
        HashSet<Integer>set = new HashSet<>();
        for(int x:ans){
            set.add(x);
        }
        return set.size();
    }
    public static void main(String[] args) {
        int[]nums={1,13,10,12,31};
        System.out.println(countDistinctIntegers(nums));
    }
}
