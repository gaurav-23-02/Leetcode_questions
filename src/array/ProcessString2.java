package array;

import java.util.Stack;

public class ProcessString2 {
    public static String removeDuplicates(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(st.size()!=0&&st.peek()==s.charAt(i)){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }

        }
        StringBuilder ans = new StringBuilder();
        for(char ch:st){
            ans.append(ch);
        }
        return ans.toString();

    }

    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(removeDuplicates(s));
    }
}
