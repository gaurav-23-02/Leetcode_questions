package hashmap;

import java.util.Arrays;
import java.util.HashMap;

public class maxNumberOfPairs {
    public static int[] numberOfPairs(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        System.out.println(map);
        int pairCount=0;
        int remain=0;
        for (int x:map.values()){
            if(x%2==0){
                pairCount+=x/2;
            }
            else{
                pairCount+=x/2;
                remain++;
            }
        }
        return new int[]{pairCount,remain};
    }
    public static void main(String[] args) {
        int[]nums={1,3,2,1,3,2,2};
        System.out.println(Arrays.toString(numberOfPairs(nums)));
    }
}
