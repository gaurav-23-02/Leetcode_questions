package array;

import java.util.ArrayList;

public class leetcode1796 {
    public static int secondHighest(String s) {
        ArrayList<Integer>list= new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                list.add(s.charAt(i)-'0');
            }
        }
        int max=-1;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>max){
                max=list.get(i);
            }
        }
        for(int i=0;i<list.size();i++){
            if(list.get(i)==max){
                list.set(i,-1);
            }
        }
        int max2=-1;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>max2){
                max2=list.get(i);
            }
        }
        System.out.println(list);
        return max2;
    }

    public static void main(String[] args) {
        String s ="dfa12321afd";
        System.out.println(secondHighest(s));
    }
}
