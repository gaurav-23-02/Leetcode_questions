package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class sumOfSq {
    public static boolean judgeSquareSum(int c) {

            Set<Integer> set=new HashSet<>();
            for(int i=0;i*i<=c;i++){
                set.add(i*i);
            }
        System.out.println(set);
            for(int x:set){
                if(set.contains(c-x)){
                    return true;
                }
                if(x*2==c){
                    return true;
                }
            }
            return false;
    }

    public static void main(String[] args) {
        System.out.println(judgeSquareSum(2147482647));

    }
}
