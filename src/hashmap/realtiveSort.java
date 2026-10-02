package hashmap;

import java.util.Arrays;
import java.util.HashMap;

public class realtiveSort {
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int x:arr2){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        return arr1;

    }
    public static void main(String[] args) {
        int[]arr1={2,3,1,3,2,4,6,7,9,2,19};
        int[]arr2={2,1,4,3,9,6};
        System.out.println(Arrays.toString(relativeSortArray(arr1,arr2)));
    }
}
