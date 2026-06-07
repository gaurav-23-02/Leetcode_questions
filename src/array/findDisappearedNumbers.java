package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class findDisappearedNumbers {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer>list=new ArrayList<>();
        HashSet<Integer>set=new HashSet<>();
        for(int i=1;i<=nums.length;i++){
            set.add(i);
        }
        System.out.println(set);
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
            }
        }
        for(int x:set){
            list.add(x);
        }return list;
    }

    public static void main(String[] args) {
        int[]nums={4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));

    }
}
