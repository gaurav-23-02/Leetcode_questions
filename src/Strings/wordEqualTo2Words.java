package Strings;

public class wordEqualTo2Words {
    public static int valueOfWord(String s){
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                ans.append("0");
            }
            if(s.charAt(i)=='b'){
                ans.append("1");
            }
            if(s.charAt(i)=='c'){
                ans.append("2");
            }
            if(s.charAt(i)=='d'){
                ans.append("3");
            }
            if(s.charAt(i)=='e'){
                ans.append("4");
            }
            if(s.charAt(i)=='f'){
                ans.append("5");
            }
            if(s.charAt(i)=='g'){
                ans.append("6");
            }
            if(s.charAt(i)=='h'){
                ans.append("7");
            }
            if(s.charAt(i)=='i'){
                ans.append("8");
            }
            if(s.charAt(i)=='j'){
                ans.append("9");
            }
        }
        System.out.println(ans);
        String a=ans.toString();
        return Integer.parseInt(a);
    }
    public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int first=valueOfWord(firstWord);
        int second=valueOfWord(secondWord);
        int target=valueOfWord(targetWord);
        if(first+second==target){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String firstWord = "j", secondWord = "j", targetWord = "bi";
        System.out.println(isSumEqual(firstWord,secondWord,targetWord));
    }
}
