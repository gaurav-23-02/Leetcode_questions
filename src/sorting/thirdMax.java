package sorting;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class thirdMax {
    public static int thirdMax1(int[] nums) {
        Set<Integer>set= new LinkedHashSet<>();
        Arrays.sort(nums);
        if(nums.length<3){
            return nums[nums.length-1];
        }
        for(int x:nums){
            set.add(x);
        }
        int idx=0;
        int[]ans=new int[set.size()];
        for(int x:set){
            ans[idx++]=x;
        }
        if(set.size()<3){
            return ans[ans.length-1];
        }
        return ans[ans.length-3];

    }

    public static void main(String[] args) {
        int[]nums={2,2,3,1};
        System.out.println(thirdMax1(nums));
    }
}
