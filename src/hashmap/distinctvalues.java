package hashmap;

import java.util.HashMap;

public class distinctvalues {
    public  static String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer>map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        System.out.println(map);
        for(int x:map.values()){
            if(x!=k){
                System.out.println(x);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String[]arr = {"d","b","c","b","c","a"};
        int k = 2;
        System.out.println(kthDistinct(arr,k));
    }
}
