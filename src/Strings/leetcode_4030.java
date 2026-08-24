package Strings;

public class leetcode_4030 {
    public static boolean isPalindromic(String s) {
        StringBuilder ans =  new StringBuilder();
        for(int i=0;i<s.length();i++){
            int n =(int)s.charAt(i);
            String x =String.format("%8s",Integer.toBinaryString(n)).replace(' ','0');
            ans.append(x);
        }
        System.out.println(ans);
        int i=0;
        int j=ans.length()-1;
        while(i<j){
            if(ans.charAt(i)==ans.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s ="ff";
        System.out.println(isPalindromic(s));
        System.out.println(
        String.format("%16s",Integer.toBinaryString(12)).replace(' ','0'));
    }

}
