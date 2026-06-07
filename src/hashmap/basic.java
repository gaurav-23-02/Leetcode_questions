package hashmap;
import java.util.*;
public class basic {
    public static void main(String[] args) {
         Map<String, Integer> mp = new HashMap<>();
         //adding a element
        mp.put("Akash",21);
        mp.put("Yash",16);
        mp.put("Harry",18);
        System.out.println(mp);
        System.out.println(mp.get("Harry"));
        mp.put("Akash",22);
        System.out.println(mp);
        mp.remove("Akash");
        System.out.println(mp);
        System.out.println(mp.containsKey("Yash"));
        mp.putIfAbsent("Rahul",22);
        System.out.println(mp);
        System.out.println(mp.keySet());
        System.out.println(mp.values());
        System.out.println(mp.entrySet());
        for(var e: mp.entrySet()){
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        }

    }

}
