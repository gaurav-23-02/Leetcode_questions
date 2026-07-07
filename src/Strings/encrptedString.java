package Strings;

public class encrptedString {
    public static String getEncryptedString(String s, int k) {
        StringBuilder ans = new StringBuilder();
        if(k>s.length()){
            k=k%s.length();
        }
        for(int i=0;i<s.length();i++){
            if(i+k<s.length()){
                ans.append(s.charAt(i+k));
            }
            else{
                ans.append(s.charAt(Math.abs(s.length()-k-i)));
            }
        }
        return ans.toString();

    }

    public static void main(String[] args) {
        System.out.println(getEncryptedString("byd",4));

    }
}
