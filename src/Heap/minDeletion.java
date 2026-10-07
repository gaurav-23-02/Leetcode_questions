package Heap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.*;

public class minDeletion {
    public static int[] minDeletions(List<Integer>list) {
        int[]ans = new int[list.size()];
        Stack<Integer>st = new Stack<>();
        st.push(list.get(list.size()-1));
        ans[ans.length-1]=0;
        for(int i=list.size()-2;i>0;i--){
            if(st.isEmpty()){
                ans[i]=0;
            }
            if(list.get(i)<st.peek()){
                while(list.get(i)<st.peek()){
                    st.pop();
                }
            }
            if(list.get(i)<st.peek()){
                ans[i]=st.peek();
            }
            st.push(list.get(i));
        }
        return ans;

    }
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(7);
        list.add(5);
        list.add(1);
        list.add(9);
        list.add(2);
        list.add(5);
        list.add(1);
        System.out.println(Arrays.toString(minDeletions(list)));
    }
}
