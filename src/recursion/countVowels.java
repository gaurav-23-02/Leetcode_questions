package recursion;

public class countVowels {
    public static int helper(String s,int i){
        if(i==s.length())return 0;
        char ch = s.charAt(i);
        int x=0;
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            x=1;
        }
        else{
            x=0;
        }
        return x+helper(s,i+1);
    }
    public static int vowel(String s){
        int i=0;
        return helper(s,i);
    }
    public static void main(String[] args) {
        String s ="gaurav";
        System.out.println(vowel(s));
    }
}
