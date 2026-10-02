package Heap;

import java.util.Arrays;
import java.util.HashMap;

public class sortThePeople {
    public static String[] sortPeople(String[] names, int[] heights) {
        String[]ans = new String[names.length];
        HashMap<Integer,String>map = new HashMap<>();
        for(int i=0;i<names.length;i++){
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        int idx=ans.length-1;

        for(int i=0;i<heights.length;i++){
            ans[idx--]=map.get(heights[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]heights={180,165,170,160};
        String[]names={"Mary","John","Emma","Rahul"};
        System.out.println(Arrays.toString(sortPeople(names,heights)));
    }
}
