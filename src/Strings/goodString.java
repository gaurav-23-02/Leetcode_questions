package Strings;

public class goodString {
    public static String goodOrbad(String s){
        int cons=0;
        int vowel=0;
        for(int i=0;i<s.length();i++){
            if(Character.isAlphabetic(s.charAt(i))){
                if(s.charAt(i)!='a'||s.charAt(i)!='e'||s.charAt(i)!='i'||s.charAt(i)!='o'||s.charAt(i)!='u'){
                    vowel++;
                    cons=0;
                }
                else{
                    cons++;
                    vowel=0;

                }
            }
        }
        if(vowel>5){
            return "bad";
        }
        else if(cons>3){
            return "bad";
        }
        return "good";
    }

    public static void main(String[] args) {
        System.out.println(goodOrbad("aeioua"));
    }
}
