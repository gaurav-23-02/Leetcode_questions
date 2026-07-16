package array;

import java.util.Arrays;

import java.util.*;

public class thirrdMax {
    public static int thirdMax(int[] nums) {
        int max=0;
        int currMax=0;
        for(int i=0;i<nums.length-1;i++){
            currMax=nums[i]*nums[i+1];
            if(currMax>max){
                max=currMax;
            }
        }
        return max;
    }
    public static int[] twoSum(int[]arr,int x){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],i);
        }
        System.out.println(map);
        int[]ans=new int[2];
        for(int i=0;i<arr.length;i++){
            int remain=x-arr[i];
            if(map.containsKey(remain)&&map.get(remain)!=i){
                ans[0]=map.get(remain);
                ans[1]=i;
            }
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }

    public static void main(String[] args) {
        int[]nums={-1,4,-4,5,-2,-1,-1,-2,-3};
        int[]arr={2,7,11,15};
        System.out.println(thirdMax(nums));
        System.out.println(twoSum(arr,18));
    }

}
