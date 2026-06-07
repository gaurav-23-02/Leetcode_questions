package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class adding_spaces {
    public static String[] sortPeople(String[] names, int[] heights) {
        HashMap<String,Integer>map= new HashMap<>();
        for(int i=0;i<names.length;i++){
            map.put(names[i],heights[i]);
        }
        System.out.println(map);
        int[]ans= new int[names.length];
        int idx=0;
        for(int x:map.values()){
            ans[idx++]=x;
        }
        Arrays.sort(ans);
        String []ans1= new String[names.length];
        System.out.println(map.entrySet());
        for(int i=ans.length-1;i>0;i--){

        }
        System.out.println(Arrays.toString(ans));
        return names;
    }


    public static void main(String[] args) {
        String names[] = {"Mary","John","Emma"};
        int []heights = {180,165,170};
        System.out.println(sortPeople(names,heights));
    }

}


