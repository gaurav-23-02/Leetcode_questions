package mathProblem;

import java.util.ArrayList;
import java.util.List;

public class selfDividingNumber {
    public static boolean divide(int n){
        int x =n;
        while(n>0){
            int m = n%10;
            if(m==0){
                return false;
            }
            if(x%m!=0){
                return false;
            }
            n/=10;
        }
        return true;
    }
    public static List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer>ans = new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(i<9){
                ans.add(i);
            }
            else if(divide(i)==true){
                ans.add(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(1,22));
    }
}
