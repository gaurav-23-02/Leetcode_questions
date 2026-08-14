package Strings;

import java.util.Stack;

public class longestSubStringWithoutRepetation {
    public static int lengthOfLongestSubstring(String s) {
        Stack<Character>st=new Stack<>();
        st.push(s.charAt(0));
        int maxCount=1;
        int count=1;
        for(int i=1;i<s.length();i++){
            if(st.contains(s.charAt(i))){
                count=0;
                while(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(s.charAt(i));
                count++;
                maxCount=Math.max(count,maxCount);
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {
        String s= "abcabccbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
