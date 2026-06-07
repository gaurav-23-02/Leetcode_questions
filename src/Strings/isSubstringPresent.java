package Strings;

public class isSubstringPresent {
    public static boolean IsSubstringPresent(String s) {
        int fHalf=0;
        int sHalf=0;
        int n = s.length()/2;
        for(int i=0;i<n;i++){
            char x = s.charAt(i);
            if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'||x=='A'||x=='E'||x=='I'||x=='O'||x=='U'){
                fHalf++;
            }
        }
        for(int i=n;i<s.length();i++){
            char x = s.charAt(i);
            if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'||x=='A'||x=='E'||x=='I'||x=='O'||x=='U'){
                sHalf++;
            }

        }
        if(fHalf==sHalf){
            return true;
        }
        return false;



    }

    public static void main(String[] args) {
        String s = "textbook";
        System.out.println(IsSubstringPresent(s));


    }
}
