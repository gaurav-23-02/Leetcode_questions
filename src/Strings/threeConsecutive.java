package Strings;

public class threeConsecutive {
    public static String makeFancyString(String s) {
        StringBuilder ans = new StringBuilder();
        int count=0;
        for(int i=0;i<s.length()-1;i++){
            char check=s.charAt(i);
            if(ans.isEmpty()){
                ans.append(s.charAt(i));
            }
            else if(s.charAt(i)==check&&s.charAt(i+2)==check){
                ans.append(s.charAt(i));
                ans.append(s.charAt(i+1));
            }
            else{
                ans.append(s.charAt(i));
            }

        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String s="leeetcode";
        System.out.println(makeFancyString(s));
    }
}
