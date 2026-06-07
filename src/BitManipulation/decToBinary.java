package BitManipulation;

import Strings.string;

public class decToBinary {
    public static String convertToBinary(int x){
        StringBuilder ans = new StringBuilder();
        System.out.println(Integer.toBinaryString(x));
        while(x>0){
            ans.append(x%2);
            x=x/2;

        }
        return ans.reverse().toString();

    }

    public static void main(String[] args) {
        int n = 13;
        System.out.println(convertToBinary(n));
    }
}
