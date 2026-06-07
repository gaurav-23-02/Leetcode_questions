package array;

import java.util.*;

public class findMisiingNumber {
    public static List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer>ans= new ArrayList<>();
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        Stack<Integer>st=new Stack<>();
        for(int i=nums[0];i<=nums[nums.length-1];i++){
            st.push(i);
        }
        System.out.println(st);
        for(int i=0;i<nums.length;i++){
            if(st.contains(nums[i])){
                st.removeElement(nums[i]);
            }
        }
        for(int x:st){
            ans.add(x);
        }
        System.out.println(st);
        return ans;
    }
    public static void main(String[] args) {
        int[]nums={1,5};
        System.out.println(findMissingElements(nums));


    }

}
