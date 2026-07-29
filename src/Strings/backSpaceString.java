package Strings;

public class backSpaceString {
    public static boolean backspaceCompare(String s, String t) {
        StringBuilder ans1 = new StringBuilder();
        StringBuilder ans2  = new StringBuilder();
        for(int i=0;i<s.length();i++){

            if(s.charAt(i)!='#'){
                ans1.append(s.charAt(i));
            }
            else if(ans1.length()>0){
                ans1.deleteCharAt(ans1.length()-1);
            }
        }
        for(int i=0;i<t.length();i++){

            if(t.charAt(i)!='#'){
                ans2.append(t.charAt(i));
            }
            else if(ans2.length()>0){
                ans2.deleteCharAt(ans2.length()-1);
            }
        }
        System.out.println(ans1);
        System.out.println(ans2);
        if(ans1.toString().equals(ans2.toString())){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String  s = "a##c", t = "#a#c";
        System.out.println(backspaceCompare(s,t));
    }
}
