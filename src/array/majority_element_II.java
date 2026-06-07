package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class majority_element_II {
    public static void main(String[] args) {
        int[]nums={3,4};
        HashMap <Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }else{
                map.put(nums[i],1);
            }
        }
        System.out.println(map.entrySet());
        int n =nums.length/3;
        ArrayList ans =new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n) {
                ans.add(entry.getKey()); // ✅ ADD KEY
            }
        }
        System.out.println(ans);
    }
}
