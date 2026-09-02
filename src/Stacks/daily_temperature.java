package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class daily_temperature {
    static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int[]ans = new int[temperatures.length];
        st.push(temperatures[0]);
        int idx=temperatures.length-1;
        ans[idx--]=0;
        for(int i=temperatures.length-2;i>0;i--){
            st.push(temperatures[i]);
            if(st.peek()<temperatures[i]){
                ans[idx--]=0;
            }
            if(st.peek()>temperatures[i]){
                int count=0;
                while(st.peek()<temperatures[i]){
                    st.pop();
                    count++;
                }
                ans[idx--]=count;
            }
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }
    public static void main(String[] args) {
        int[]temp={73,74,75,71,69,72,76,73};
        System.out.println(dailyTemperatures(temp));
    }
}
