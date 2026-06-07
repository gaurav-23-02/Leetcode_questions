package hashmap;

import java.util.HashMap;

public class maxfrequent {
    public static void main(String[] args) {
        int[]arr={1,4,2,5,1,4,4,6,4,4,4,};
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int el: arr){
            if(!mp.containsKey(el)){
                mp.put(el,1);
            }else{
                mp.put(el,mp.get(el)+1);
            }
        }
        System.out.println("frequency map"+mp.entrySet());
        int maxFrequency =-1;
        int ansKey=-1;
        for(var e: mp.entrySet()){
            if(e.getValue()>maxFrequency){
                maxFrequency=e.getValue();
                ansKey=e.getKey();
            }

        }
        System.out.printf("%d has max frequeency and it occurs %d times",ansKey,maxFrequency);
    }
}
