package hashmap;

import java.math.BigInteger;
import java.util.*;

public class sortPeople {
    public static String sortPeople1(String[]nums,int k){
        BigInteger[]arr=new BigInteger[nums.length];
        int idx=0;
        for(String x: nums){
            arr[idx++]=new BigInteger(x);
        }
        Arrays.sort(arr);
        return arr[arr.length-k]+"";
    }

    public static void main(String[] args) {
        String[]nums={"2","21","12","1"};
        int k=3;
        System.out.println(sortPeople1(nums,k));

    }
}
