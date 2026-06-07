package Strings;

public class student_attendance {
    public static boolean checkRecord(String s) {
        int present=0;
        int absent=0;
        int late=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='P'){
                present++;
            }
            if(s.charAt(i)=='L'){
                late++;
            }
            if(s.charAt(i)=='A'){
                absent++;
            }
        }
        if(absent<2&&!s.contains("LLL")){
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        String s="PPLAA";
        System.out.println(checkRecord(s));
    }
}
