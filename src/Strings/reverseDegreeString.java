package Strings;

public class reverseDegreeString {
    public static int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int mul=1;
            int number=0;
            number=(27-(s.charAt(i)-'a'+1));
            mul=number*(i+1);
            sum+=mul;
        }
        return sum;
    }

    public static void main(String[] args) {
        String s ="abc";
        System.out.println(reverseDegree(s));
    }

}
