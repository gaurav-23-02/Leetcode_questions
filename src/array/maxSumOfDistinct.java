package array;

import java.util.*;

public class maxSumOfDistinct {
    public int[] maxKDistinct(int[] nums, int k) {
        Set<Integer> set=new HashSet<>();
        for(int x:nums){
            set.add(x);
        }
        ArrayList<Integer>list=new ArrayList<>();
        for(int x:set){
            list.add(x);
        }
        Collections.sort(list);
        int[]ans=new int[k];
        int idx=0;
        if(k>list.size()){
            int[]ans1=new int[list.size()];
            for(int i=list.size()-1;i>0;i--){
                ans1[idx++]=list.get(i);
            }
            System.out.println(Arrays.toString(ans1));
            return ans1;
        }
        for(int i=list.size()-1;i>=list.size()-k;i--){
            ans[idx++]=list.get(i);
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }

    public static void main(String[] args) {
        maxSumOfDistinct obj = new maxSumOfDistinct();
        int[]nums={1,1,1,2,2,2};
        System.out.println(obj.maxKDistinct(nums,6));
    }
}
