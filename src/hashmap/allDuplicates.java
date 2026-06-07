package hashmap;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.*;
public class allDuplicates {
    public static int dailyTemperatures(int[] height) {
        int j=height.length-1;
        int i=0;
        int max=0;
        while(i<j){
            int x=Math.min(height[i],height[j]);
            int n=x*(j-i);
            if(n>max){
                max=n;
            }
            i++;
        }
        return max;
    }


    public static void main(String[] args) {
        int[] height = {1,1};
        System.out.println(dailyTemperatures(height));


    }
}
