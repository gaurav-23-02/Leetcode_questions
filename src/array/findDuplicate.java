package array;

import java.util.HashSet;
import java.util.Set;

public class findDuplicate {
    static public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int ans=0;
        for(int x:nums){
            if(!set.contains(x)){
                set.add(x);
            }else{
                ans=x;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int[]nums={3,3,3,3,3};
        System.out.println(findDuplicate(nums));
    }
}
