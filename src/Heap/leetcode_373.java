package Heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class leetcode_373 {
    public static class Tri{
        int first;
        int second;
        int third;
        Tri(int first,int second,int third){
            this.first=first;
            this.second=second;
            this.third=third;
        }
    }
    public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<Tri>allPair=new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                allPair.add(new Tri(nums1[i],nums2[j],nums1[i]+nums2[j]));
            }
        }
        allPair.sort((a,b)->Integer.compare(a.third,b.third));
        for(int i=0;i<=k;i++){
            List<Integer>level = new ArrayList<>();
            level.add(allPair.get(i).first);
            level.add(allPair.get(i).second);
            ans.add(level);
        }
        for(Tri x:allPair){
            System.out.println(x.first+" "+x.second+" "+x.third);
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] nums1={1,1,2};
        int[] nums2={1,2,3};
        System.out.println(kSmallestPairs(nums1,nums2,2));
    }
}
