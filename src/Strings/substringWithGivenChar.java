package Strings;

public class substringWithGivenChar {
    public static long countSubstrings(String s, char c) {
        long count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                count++;
            }
        }
        long ans=(count*(count+1))/2;

        return ans;
    }

    public static void main(String[] args) {
        String s="abada";
        char c='a';
        System.out.println(countSubstrings(s,c));
    }
}
