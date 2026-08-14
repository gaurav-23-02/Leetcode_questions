package Strings;

import java.util.Arrays;

public class stringCompression {
    public static int compress(char[] chars){
        StringBuilder ans = new StringBuilder();
        int i=0;
        int j=0;
        int count=0;
        ans.append(chars[0]);
        while(j<chars.length){
            if(chars[i]==chars[j]){
                j++;
                count++;
            }
            else if(chars[i]!=chars[j]){
                if(count>1){
                    ans.append(count);
                }
                count=0;
                i=j;
                ans.append(chars[j]);
            }
        }
        if(count>1){
            ans.append(count);
        }

        System.out.println(ans);
        Arrays.fill(chars,'0');
        for(int x=0;x<ans.length();x++){
            chars[x]=ans.charAt(x);
        }
        System.out.println(Arrays.toString(chars));
        return ans.length();
    }
    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        System.out.println(compress(chars));
    }
}
