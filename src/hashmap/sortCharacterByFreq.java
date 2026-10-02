package hashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class sortCharacterByFreq {
    public static int frequencySort(int[]nums,int k) {
        int count=0;
        int mul=1;
        int j=0;
        for(int i=0;i<nums.length;i++){
            mul*=nums[i];
            while(mul>=k){
                mul/=nums[j];
                j++;
            }
            count+=i-j+1;
        }
        return count;
    }
    public static void main(String[] args) {
        int[]nums={10,5,2,6};
        System.out.println(frequencySort(nums,100));
    }
}
