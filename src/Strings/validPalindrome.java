package Strings;

public class validPalindrome {
    public static boolean isPalindrome(String s) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                ans.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        String ans1 = ans.toString();
        String revAns = ans.reverse().toString();
        System.out.println(ans);
        System.out.println(revAns);
        if (ans1.equals(revAns)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "0P";
        System.out.println(isPalindrome(s));
    }
}