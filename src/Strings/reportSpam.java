package Strings;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class reportSpam {
    static boolean reportSpam(String[] message, String[] bannedWords) {
        HashMap<String,Integer>map = new LinkedHashMap<>();
        for(int i=0;i<bannedWords.length;i++){
            map.put(bannedWords[i],0);
        }
        for(int i=0;i<message.length;i++){
            if(map.containsKey(message[i])){
                map.put(message[i],map.getOrDefault(message[i],0)+1);
            }
        }
        int sum=0;
        for(int x:map.values()){
            sum+=x;
        }
        if(sum>=2)return true;
        return false;
    }

    public static void main(String[] args) {
        String[]message={"l","i","l","i","l"};
        String[]bannedWords={"d","a","i","v","a"};
        System.out.println(reportSpam(message,bannedWords));
    }
}
