package array;

import java.util.HashMap;

import static java.lang.Integer.parseInt;

public class matchIndex {
    public static int countSeniors(String[] details) {
        int count=0;
        for(int i=0;i<details.length;i++){
            String s = details[i].substring(11,13);
            int s1  =parseInt(s);
            if(s1>60){
                count++;
            }
        }
        return count;


    }

    public static void main(String[] args) {
       String[] details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        System.out.println(countSeniors(details));
    }

}
