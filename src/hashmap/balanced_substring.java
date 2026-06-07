package hashmap;

import java.util.Arrays;
import java.util.HashMap;

public class balanced_substring {
    public static void main(String[] args) {
        String s="successes";
        int voweMax=0;
        int charMax=0;
        char[]arr=s.toCharArray();
        int idxvowel=1;
        int idxnormal=1;
        HashMap<Character,Integer> vowel =new HashMap<>();
        HashMap<Character,Integer> normal =new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                vowel.put(arr[i], vowel.getOrDefault(arr[i],0)+1);
            } else {
                normal.put(arr[i], normal.getOrDefault(arr[i],0)+1);
            }
        }
        for(int x: normal.values()){
            if(x>voweMax){
                voweMax=x;
            }
        }
        for(int y: vowel.values()){
            if(y>charMax){
                charMax=y;
            }
        }
        System.out.println(vowel.entrySet());
        System.out.println(normal.entrySet());
        System.out.println(charMax+voweMax);
    }

}