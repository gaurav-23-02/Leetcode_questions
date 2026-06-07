package array;

import java.util.Arrays;
import java.util.HashMap;

public class contains_duplicate2 {
    public static int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer>map = new HashMap<>();
        for(int i=0;i<stones.length();i++){
            map.put(stones.charAt(i), map.getOrDefault(stones.charAt(i),0)+1);
        }
        int sum=0;
        for(char c:jewels.toCharArray()){
            sum+=map.getOrDefault(c,0);
        }
        return sum;
    }


    public static void main(String[] args) {

        String jewels = "aA"; String stones = "aAAAbbbb";
        System.out.println(numJewelsInStones(jewels,stones));

    }

}
