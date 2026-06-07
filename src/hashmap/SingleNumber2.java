package hashmap;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber2 {
    public static int singleNumber(int x) {
        int ans=1;
        for(int i=0;i<=x;i++){
            if(i*i<=x){
                ans=i;
            }else{
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int x = 4;
        System.out.println(singleNumber(x));
    }

}
