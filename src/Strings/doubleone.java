package Strings;

public class doubleone {
    public static boolean checkOnesSegment(String s) {
        int idx=s.indexOf('0');
        if(idx==-1)return true;
        for(int i=idx;i<s.length();i++){
            if(s.charAt(i)!='0'){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String s ="1100001";
        System.out.println(checkOnesSegment(s));
    }
}
