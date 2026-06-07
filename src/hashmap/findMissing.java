package hashmap;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashMap;
import java.util.*;
import java.util.Map;

public class findMissing {
    public static int numSteps(String s) {
        int n=Integer.parseInt(s,2);
        int count=0;
        while(n!=1){
            if(n%2==0){
                n=n>>1;
            }
            else{
                n++;
            }
            count++;
        }
        return count;

    }



    public static void main(String[] args) {
        String s="1";
        System.out.println(numSteps(s));
    }
}
