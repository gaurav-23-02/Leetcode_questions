package slidingWindow;

import java.util.Arrays;

public class defuseTheBomb {
    public static int[] decrypt(int[] code, int k) {
        if(k==0){
            int i=0;
            for(int x:code){
                code[i++]=0;
            }
            return code;
        }
        int[]newCode = new int[2*code.length];
        int i=0;
        int j=0;
        while(i<newCode.length){
            newCode[i]=code[j];
            i++;
            j++;
            if(i==code.length){
                j=0;
            }
        }
        int[] ans = new int[code.length];
        if(k>0){
            int sum=0;
            for(int x=1;x<=k;x++){
                sum=newCode[x];
            }
            ans[0]=sum;
            int a=0;
            for(int x=k;x<newCode.length;x++){
                sum+=newCode[x];
                sum=sum-=newCode[a++];
                ans[x]=sum;
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        int[]code ={5,7,1,4};
        System.out.println(Arrays.toString(decrypt(code,3)));
    }
}
