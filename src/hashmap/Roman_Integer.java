package hashmap;

import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Roman_Integer {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> ans = new HashSet<>();
        Set<Integer> nums_1 = new HashSet<>();
        Set<Integer> nums_2 = new HashSet<>();
        for(int x:nums1){
            nums_1.add(x);
        }
        for(int x:nums2){
            nums_2.add(x);
        }
        for(int x:nums_1){
            if(nums_2.contains(x)){
                ans.add(x);
            }
        }
        System.out.println(nums_1);
        System.out.println(nums_2);
        System.out.println(ans);
        int[] arr = ans.stream().mapToInt(Integer::intValue).toArray();
        ;

        return arr;
    }
    public static void main(String[] args) {
        int[]nums1={4,9,5};
        int[]nums2={9,4,9,8,4};
        System.out.println(intersection(nums1,nums2));



    }
}
