package Strings;

public class validPalindrome {
    public static boolean isPalindrome(String s) {
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
                ans.append(s.charAt(i));
            }
            if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){
                char a=Character.toLowerCase(s.charAt(i));
                ans.append(a);
            }
        }
        System.out.println(ans);
        String original=ans.toString();
        String z = ans.reverse().toString();
        System.out.println(z);
        if(original.equals(z)){
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String[] args) {
        String s="race a car";
        System.out.println(isPalindrome(s));
    }
}
