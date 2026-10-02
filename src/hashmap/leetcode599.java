package hashmap;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class leetcode599 {
    public static String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer>map = new HashMap<>();
        for(String x:list1){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(String x:list2){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        System.out.println(map);
        List<String> list = new ArrayList<>();
        for(Map.Entry<String ,Integer>entry:map.entrySet()){
            if(entry.getValue()>1){
                list.add(entry.getKey());
            }
        }
        HashMap<String,Integer>map1=new HashMap<>();
        for(int i=0;i<list.size();i++) {
            int value = 0;
            for (int x = 0; x < list1.length; x++) {
                if (list.get(i).equals(list1[x])) {
                    value += x;
                    break;
                }
            }
            for (int y = 0; y < list2.length; y++) {
                if (list.get(i).equals(list2[y])) {
                    value += y;
                    break;
                }
            }
            map1.put(list.get(i), value);
        }
        int min=Integer.MAX_VALUE;
        for(int x:map1.values()){
            min=Math.min(x,min);
        }
        int count=0;
        for(int x:map1.values()){
            if(x==min)count++;
        }
        String[]ans = new String[count];
        int idx=0;
        for(Map.Entry<String ,Integer>entry:map1.entrySet()){
            if(entry.getValue()==min){
                ans[idx++]=entry.getKey();
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String[]list1 = {"happy","sad","good"}, list2 = {"sad","happy","good"};
        System.out.println(Arrays.toString(findRestaurant(list1,list2)));
    }
}
