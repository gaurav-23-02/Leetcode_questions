package Strings;

public class equal_char {
    public static int maxLengthBetweenEqualCharacters(String s) {
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    String p = s.substring(i+1,j);
                    return p.length();
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s ="abc";
        System.out.println(maxLengthBetweenEqualCharacters(s));

    }
}
