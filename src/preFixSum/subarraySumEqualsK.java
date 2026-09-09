package preFixSum;

import java.util.*;

public class subarraySumEqualsK {
    public static int sum(List<Integer>sub){
        int x=0;
        for(int x1:sub){
            x+=x1;
        }
        return x;
    }
    public static int subSum(int[]nums,int k){
        int count=0;
        List<Integer>ans= new ArrayList<>();
        for(int x:nums){
            ans.add(x);
        }
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<=nums.length;j++){
                List<Integer>sub = new ArrayList<>(ans.subList(i,j));
                if(sum(sub)==k){
                    count++;
                }
            }


        }
        return count;
    }
    public static void main(String[] args) {
        int[]nums={1,1,1};
        int k=2;
        System.out.println(subSum(nums,k));
    }
}
