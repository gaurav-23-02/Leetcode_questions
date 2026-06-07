package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class closestElement {
    public static int thirdMax(int[] nums) {
        PriorityQueue<Integer>ans = new PriorityQueue<>();
        for(int x:nums){
            ans.add(x);
            if(ans.size()>3){
                ans.remove();
            }
        }
        return ans.peek();
    }


    public static void main(String[] args) {
        int[]prices={2,2,3,1};
        System.out.println(thirdMax(prices));
    }

}
