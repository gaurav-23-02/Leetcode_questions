package Strings;

public class matchingEnds {
    public static int  vowelConsonantScore(String s) {
        int vowel=0;
        int cons=0;
        int num=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                vowel++;
            }
            else if(!Character.isAlphabetic(s.charAt(i))){
                num++;
            }
            else{
                cons++;
            }
        }
        if(cons==0){
            return 0;
        }
        return vowel/cons;
    }

    public static void main(String[] args) {
        String s="i3";
        System.out.println(vowelConsonantScore(s));

    }
}
