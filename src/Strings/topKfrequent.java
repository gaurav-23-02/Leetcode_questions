package Strings;

public class topKfrequent {
    public static String removeSpace(String s){
        StringBuilder  ans = new StringBuilder();
        for(char x:s.toCharArray()){
            if(x!=' '){
                ans.append(x);
            }
        }
        return ans.toString();

    }
    public static String ignoreSymbol(String s){
        StringBuilder ans = new StringBuilder();
        for(char x: s.toCharArray()){
            if(Character.isAlphabetic(x)){
                ans.append(Character.toLowerCase(x));
            }
        }
        String y = ans.reverse().toString();
        if(ans.toString().equals(y)){
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        String s=" gaur av";
        System.out.println(removeSpace(s));
        String x="I am :IronnorI ma,i";
        System.out.println(ignoreSymbol(x));
    }
}
