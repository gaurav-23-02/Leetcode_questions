package Strings;

import java.util.ArrayList;
import java.util.List;

public class common_char {
    public static boolean hasAllCodes(String s, int k) {
        ArrayList<String>code=new ArrayList<>();
        for(int i=0;i<8;i++){
            code.add(Integer.toBinaryString(i));
        }
        System.out.println(code);
        return true;

    }

    public static void main(String[] args) {
        String s="00110110";
        System.out.println(hasAllCodes(s,2));

    }
}
