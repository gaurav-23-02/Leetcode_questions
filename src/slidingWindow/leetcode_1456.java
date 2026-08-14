package slidingWindow;

public class leetcode_1456 {
    public static int maxVowels(String s, int k) {
        int count=0;
        int maxCount=0;
        for(int i=0;i<k;i++){
            char x =s.charAt(i);
            if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'){
                count++;
            }
        }
        maxCount=count;
        for(int i=k;i<s.length();i++){
            char x =s.charAt(i);
            if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'){
                count++;
            }
            char x1=s.charAt(i-k);
            if(x1=='a'||x1=='e'||x1=='i'||x1=='o'||x1=='u'){
                count--;
            }
            maxCount=Math.max(count,maxCount);
        }
        return maxCount;
    }

    public static void main(String[] args) {
        System.out.println(maxVowels("abciiidef",3));
    }
}
