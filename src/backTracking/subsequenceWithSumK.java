package backTracking;

import java.util.ArrayList;
import java.util.List;

public class subsequenceWithSumK {
    public static void helper(List<Integer>ans,int[]nums,int i,int sum){
        if(i==nums.length){
            ans.add(sum);
            return;
        }
        sum+=nums[i];
        helper(ans,nums,i+1,sum);
        sum-=nums[i];
        helper(ans,nums,i+1,sum);
    }
    public static int sub(int[]nums,int k){
        List<Integer> ans = new ArrayList<>();
        helper(ans,nums,0,0);
        System.out.println(ans);
        int count=0;
        for(int i=0;i<ans.size();i++){
            if(ans.get(i)==k){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[]nums={3,5,6,7};
        System.out.println(sub(nums,9));
    }
}
