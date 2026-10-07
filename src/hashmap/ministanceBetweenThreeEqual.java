package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ministanceBetweenThreeEqual {
    public static int minimumDistance(int[] nums) {
        HashMap<Integer, List<Integer>>map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.putIfAbsent(nums[i],new ArrayList<>());
            map.get(nums[i]).add(i);
        }
        int min=Integer.MAX_VALUE;
        for(List x:map.values()){
            if(x.size()==3){
                int listMin=Integer.MAX_VALUE;
                int i=(int)x.get(0);
                int j=(int)x.get(1);
                int k=(int)x.get(2);
                listMin=Math.abs(i-j)+Math.abs(k-i)+Math.abs(j-k);
                min=Math.min(listMin,min);
            }
        }
        System.out.println(map);
        return min;
    }
    public static void main(String[] args) {
        int[] nums={1,1,2,3,2,1,2};
        System.out.println(minimumDistance(nums));
    }
}
