package array;

import java.util.ArrayList;
import java.util.Arrays;

public class twoSum_II {
    public static boolean square_sum(int c){
        System.out.println(11%2);
        ArrayList<Integer>ans = new ArrayList<>();
        for(int i=1;i*i<c;i++){
            ans.add(i*i);
        }
        System.out.println(ans);
        int i=0;
        int j=ans.size()-1;
        while(i<j) {
            if(ans.get(i)+ans.get(j)<c){
                i++;
            }else if(ans.get(i)+ans.get(j)>c){
                j--;
            }else{
                return true;
            }


        }return false;
    }

    public static void main(String[] args) {
        int c=5;
        System.out.println(square_sum(4));
    }

}
