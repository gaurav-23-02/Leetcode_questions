package Strings;

public class validWord {
    public static boolean isValid(String word) {
        if(word.length()<3){
            return false;
        }
        int count=0;
        int vowel=0;
        for(int i=0;i<word.length();i++){
            if(!Character.isLetterOrDigit(word.charAt(i))){
                return false;
            }
            if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u'||
            word.charAt(i)=='A'||word.charAt(i)=='E'||word.charAt(i)=='I'||word.charAt(i)=='O'||word.charAt(i)=='U'){
                vowel++;
            }
            else if(Character.isAlphabetic(word.charAt(i))){
                count++;
            }
        }
        if(count<1){
            return false;
        }
        if(vowel<1){
            return false;
        }
        return true;


    }

    public static void main(String[] args) {
        System.out.println(isValid("234Adas"));
    }
}
