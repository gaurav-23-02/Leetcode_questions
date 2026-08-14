package TCSNQTPYQ;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class frequencyOfWord {
    public static void frequency(String s){
        String[]words= s.split(" ");
        System.out.println(Arrays.toString(words));
        for(int i=0;i<words.length;i++){
            StringBuilder ans = new StringBuilder(words[i]);
            for(int j=0;j<ans.length();j++){
                if(Character.isDigit(ans.charAt(j))){
                    System.out.println("Invalid Input");
                    return;
                }
            }
        }
        HashMap<String,Integer>map =new HashMap<>();
        for(int i=0;i<words.length;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        for(Map.Entry<String,Integer>entry: map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.nextLine();
        frequency(s);
    }
}
