package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

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

    public static void main(String[] args) {
        int[]arr={1,2};
        System.out.println(uniqueOccurrences(arr));

    }
}
