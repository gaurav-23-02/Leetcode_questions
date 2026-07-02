package Strings;

import java.util.Arrays;

public class fillX {
    public static String[] divideString(String s, int k, char fill) {
        int n=0;
        if(s.length()%k==0){
            n=s.length()/k;
        }
        else{
            n=(s.length()/k)+1;
        }
        String[] ans = new String[n];
        System.out.println(s.length());
        int x=k;
        int idx=0;
        int m=0;
        for(int i=0;i<s.length();i++){
            if(k>=s.length()){
                ans[idx++]=s;
                break;
            }
            ans[idx++]=s.substring(m,k);
            m+=x;
            k+=x;
            if(k>=s.length()){
                ans[idx++]=s.substring(m,s.length());
                break;
            }
        }
        if(ans[ans.length-1].length()<k){
            StringBuilder ans1 = new StringBuilder(ans[ans.length-1]);
            while(ans1.length()<x){
                ans1.append(fill);
            }
            ans[ans.length-1]=ans1.toString();
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }

    public static void main(String[] args) {
        String s = "abcdefghij";
        int k=3;
        char fill='x';
        System.out.println(divideString(s,k,fill));

    }
}
