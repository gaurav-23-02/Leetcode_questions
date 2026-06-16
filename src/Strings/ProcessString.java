package Strings;

public class ProcessString {
    public static String processStr(String s) {
        StringBuilder ans =  new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
                ans.append(s.charAt(i));
            }
            if(s.charAt(i)=='#'){
                String a = ans.toString();
                ans.append(a);
            }
            if(s.charAt(i)=='%'){
                ans.reverse();
            }
            if(s.charAt(i)=='*'){
                if(ans.length()!=0){
                    ans.deleteCharAt(ans.length()-1);
                }

            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String s = "cd%#*#";
        System.out.println(processStr(s));
    }
}
