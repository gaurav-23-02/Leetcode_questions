package Strings;

public class vowelCount {
    public static String reverseWords(String s) {
        String[]word=s.split(" ");
        StringBuilder ans = new StringBuilder();
        int count=0;
        for(int i=0;i<word[0].length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println(count);
        ans.append(word[0]);
        ans.append(" ");
        for(int i=1;i<word.length;i++){
            StringBuilder x = new StringBuilder(word[i]);
            int countX=0;
            for(int j=0;j<x.length();j++){
                if(x.charAt(j)=='a'||x.charAt(j)=='e'||x.charAt(j)=='i'||x.charAt(j)=='o'||x.charAt(j)=='u'){
                    countX++;
                }
            }
            if(countX==count){
                StringBuilder ans1 = new StringBuilder(word[i]);
                String a=ans1.reverse().toString();
                ans.append(a);
                ans.append(" ");
            }
            else{
                ans.append(x);
                ans.append(" ");
            }

        }
        ans.deleteCharAt(ans.length()-1);
        return ans.toString();

    }
    public static void main(String[] args) {
        String s = "cat and mice";
        System.out.println(reverseWords(s));
    }
}
