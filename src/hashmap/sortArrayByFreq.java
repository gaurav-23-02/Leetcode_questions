package hashmap;

import java.util.*;

public class sortArrayByFreq {
    public static int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b)->{
            if(!map.get(a).equals(map.get(b))){
                return map.get(a)-map.get(b);
            }
            return b-a;
        });
        System.out.println(list);
        int[]ans = new int[nums.length];
        int idx=0;
        for(int x:list){
            for(int i=0;i<map.get(x);i++){
                ans[idx++]=x;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]nums={1,2,2,3,3};
        System.out.println(Arrays.toString(frequencySort(nums)));
    }
}
