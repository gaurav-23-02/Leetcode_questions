package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.*;

public class rankTransform {
    public static int[]  arrayRankTransform(int[]arr){
        int idx=0;
        int[]nums=new int[arr.length];
        for(int x:arr){
            nums[idx++]=x;
        }
        Arrays.sort(nums);
        int value=1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],value);
                value++;
            }

        }
        int[]ans=new int[arr.length];
        int index=0;
        for(int i=0;i<arr.length;i++){
            ans[i]=map.get(arr[i]);
        }
        return arr;
    }
    public static void main(String[] args) {
        int[]arr={37,12,28,9,100,56,80,5,12};
        System.out.println(arrayRankTransform(arr));

    }
}
