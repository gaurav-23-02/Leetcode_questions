package Strings;

import javax.print.DocFlavor;

public class ClearDigits {
    public static String clearDigits(String s) {
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if
            (Character.isLetter(s.charAt(i))){
                ans.append(s.charAt(i));
            }
            else{
                ans.deleteCharAt(ans.length()-1);
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(clearDigits("cb34"));
    }
}
