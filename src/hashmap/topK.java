package hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.*;

public class topK {
    class Pair{
        int object;
        int freq;
        Pair(int object,int freq){
            this.object=object;
            this.freq=freq;
        }
    }
    public  int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Pair>ans = new ArrayList<>();
        for(int key:map.keySet()){
            ans.add(new Pair(key,map.get(key)));
        }
        ans.sort((a, b) -> b.freq - a.freq);
        int[]ans1=new int[k];
        for(int i=0;i<k;i++){
            ans1[i]=ans.get(i).object;
        }
        System.out.println(Arrays.toString(ans1));
        return ans1;
    }

    public void main(String[] args) {
        int []nums={1,1,1,2,2,3};
        System.out.println(topKFrequent(nums,2));
    }
}
