package mathProblem;

public class symmertricInterger {
    public static boolean checkString(String s) {
        int idx=s.indexOf('b');
        if(!s.contains('b'+"")){
            return true;
        }
        for(int i=idx;i<s.length();i++){
            if(s.charAt(i)=='a'){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(checkString("a"));
    }


}
