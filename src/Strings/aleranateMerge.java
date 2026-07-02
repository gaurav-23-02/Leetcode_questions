package Strings;

public class aleranateMerge {
    static int i;
    public static String mergeAlternately(String word1, String word2) {
        int n=Math.min(word1.length(),word2.length());
        StringBuilder ans = new StringBuilder();
        for(i=0;i<n;i++){
            ans.append(word1.charAt(i));
            ans.append(word2.charAt(i));
            System.out.println(i);
        }
        int x=word1.length();
        int y=word2.length();
        if(x>y){
            ans.append(word1.substring(i,x));
        }
        else if(y>x){
            ans.append(word2.substring(i,y));
        }
        else{
            return ans.toString();
        }
        return ans.toString();
    }


    public static void main(String[] args) {
        System.out.println(mergeAlternately("abcd","pq"));
    }
}
