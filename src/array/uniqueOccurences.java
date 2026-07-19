package array;

import java.util.*;

public class uniqueOccurences {
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>map= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        ArrayList<Integer>list = new ArrayList<>();
        for(int x:map.values()){
            list.add(x);
        }
        HashSet<Integer>set= new HashSet<>();
        for(int x:list){
            set.add(x);
        }
        if(set.size()!=list.size()){
            return false;
        }
        return true;
    }
    public static int firstUniqueEven(int[] nums) {
        if(nums.length==1)
            return  nums[0];
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0&&map.get(nums[i])==1){
                return nums[i];
            }
        }

        return -1;
    }
    public static boolean isPerfect(int n){
        for(int i=2;i*i<=n;i++){
            if((i*i)%n==0){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[]arr={1,2};
//        int[]nums={8,2};
//        System.out.println(uniqueOccurrences(arr));
//        System.out.println(firstUniqueEven(nums));
        System.out.println(isPerfect(16));

    }
}
