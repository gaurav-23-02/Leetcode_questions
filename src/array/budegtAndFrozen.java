package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class budegtAndFrozen {
    public static int frozen(int[]costs,int[]category,int b,int c){
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<costs.length;i++){
            if(category[i]==1){
                map.put(costs[i],1);
            }
        }
        ArrayList<Integer>list = new ArrayList<>();
        for(HashMap.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getKey()==1){
                list.add(entry.getKey());
            }
        }
        ArrayList<Integer>list2 = new ArrayList<>();
        for(int i=0;i<costs.length;i++){
            if(!map.containsKey(costs[i])){
                list2.add(costs[i]);
            }
        }
        System.out.println(list2);
        Collections.sort(list);
        System.out.println(map);
        return 1;
    }
    public static void main(String[] args) {
        int[]costs={5,8,12,3,20};
        int[]category={0,0,1,1,0};
        int b=30;
        int c=10;
        System.out.println(frozen(costs,category,b,c));

    }
}
