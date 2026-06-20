package Strings;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class passwordStrength {
    public static int passwordStrength1(String password) {
        int strength=0;
        Set<Character> set=new HashSet<>();
        for(Character x:password.toCharArray()){
            set.add(x);
        }
        for(Character x:set){
            if(x>='a'&& x<='z') {
                strength++;
            }
            else if(x>='A'&&x<='Z'){
                strength+=2;
            }
            else if(x=='!'||x=='@'||x=='#'||x=='$'){
                strength+=5;
            }
            else{
                strength+=3;
            }
        }

        return strength;
    }

    public static void main(String[] args) {
        String password="bbB11#";
        System.out.println(passwordStrength1(password));
    }
}
