package BitManipulation;

public class bitForEqualInts {
    public static boolean minChanges(String[]message,String[]bannedWords) {
        StringBuilder ans = new StringBuilder();
        for(String x:message){
            ans.append(x);
            ans.append(" ");
        }
        String check=ans.toString();
        System.out.println(check);
        int count=0;
        for(int i=0;i<bannedWords.length;i++){
            if(check.contains(bannedWords[i])){
                count++;
            }
        }
        if(count>=2){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String[]message={"gy","tv","t","hvu","f","vgp","q"};
        String[]bannedWords={"nunn","vg","jfpi","a","am","or","y"};
        System.out.println(minChanges(message,bannedWords));
    }
}
