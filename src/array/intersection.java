package array;

import java.util.ArrayList;
import java.util.HashMap;

public class intersection {
    public static void main(String[] args) {
        int []nums1={9,4,9,8,4};
        int []nums2={4,9,5};
        ArrayList ans=new ArrayList();
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);

        }
        System.out.println(map.entrySet());
        for(int i=0;i<nums2.length;i++){
            if(map.containsValue(nums2[i])){
                if(!ans.contains(nums2[i])){
                    ans.add(nums2[i]);
                }

            }else{
                map.put(nums2[i],map.getOrDefault(nums2[i],0)+1);
            }

        }
        System.out.println(ans);

    }
}
