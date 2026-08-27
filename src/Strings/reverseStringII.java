package Strings;

public class reverseStringII {
    public static String reverseStr(String s, int k) {
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<k;i++){
            ans.append(s.charAt(i));
        }
        String x=ans.reverse().toString();
        String rem = s.substring(k,s.length());
        String fullAns = x+rem;
        System.out.println(fullAns);
        return ans.toString();
    }

    public static void main(String[] args) {
        String s ="abcdefg";
        int k=2;
        System.out.println(reverseStr(s,k));
    }
}
