package hashmap;
import java.util.*;

public class specialOcuurance {
    static int countSpecialIntegers(int[] nums) {
        HashMap<Integer,Integer>map = new LinkedHashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        ArrayList<Integer>list = new ArrayList<>();
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()>=3){
                list.add(entry.getKey());
            }
        }
        System.out.println(list);
        int count=0;
        for(int i=0;i<list.size();i++){
            List<Double>indexs =new ArrayList<>();
            int idx=0;
            for(int j=0;j<nums.length;j++){
                if(list.get(i)==nums[j]){
                    indexs.add(j+.0);
                }
            }
            System.out.println(indexs);
            for(int x=1;x<indexs.size()-1;x++){
                if(indexs.get(x)==(indexs.get(x-1)+indexs.get(x+1))/2){
                    count++;
                    break;
                }
            }

        }
        return count;

    }
    public static void main(String[] args) {
        int[]nums={8,8,8,8};
        System.out.println(countSpecialIntegers(nums));
    }
}
