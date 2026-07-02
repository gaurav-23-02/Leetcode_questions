package Strings;

public class maxNumberOfWords {
    public static int wordCount(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                count++;
            }
        }
        return count+1;
    }
    public static int mostWordsFound(String[] sentences) {
        int max=0;
        for(int i=0;i<sentences.length;i++){
            if(wordCount(sentences[i])>max){
                max=wordCount(sentences[i]);
            }
        }
        return max;

    }

    public static void main(String[] args) {
        String[]sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentences));
    }
}
