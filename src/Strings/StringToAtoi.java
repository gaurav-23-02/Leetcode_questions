package Strings;

public class StringToAtoi {
    public static int myAtoi(String s) {
        s=s.trim();
        if(s.length()==0)return 0;
        int i=0;
        int sign=1;
        long num=0;
        if(s.charAt(i)=='-'){
            sign=-1;
            i++;
        }
        else if(s.charAt(i)=='+'){
            sign=1;
            i++;
        }
        while(i<s.length()&&Character.isDigit(s.charAt(i))){
            num=num*10+(s.charAt(i)-'0');
            if(sign==1&&num>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(sign==-1&&num<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int)(sign*num);
    }
    public static void main(String[] args) {
        String s = "-91283472332";
        System.out.println(myAtoi(s));
    }
}
