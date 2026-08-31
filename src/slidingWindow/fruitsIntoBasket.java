package slidingWindow;

import java.util.HashMap;
import java.util.HashSet;

public class fruitsIntoBasket {
    public static int totalFruit(int[] fruits) {
        int low=0;
        int res=0;
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int high=0;high<fruits.length;high++){
            map.put(fruits[high],map.getOrDefault(fruits[high],0)+1);
            while(map.size()>2){
                int leftFruit = fruits[low];
                map.put(leftFruit,map.get(leftFruit)-1);
                if(map.get(leftFruit)==0){
                    map.remove(leftFruit);
                }
                low++;
            }
            if(map.size()==2){
                res=Math.max(res,high-low+1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[]fruits={0};
        System.out.println(totalFruit(fruits));
    }
}
