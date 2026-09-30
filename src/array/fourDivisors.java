package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fourDivisors {
    public static int sumFourDivisors(int[] nums) {
        List<List<Integer>>divisor=  new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int count=0;
            List<Integer>divs=new ArrayList<>();
            for(int j=1;j<=nums[i];j++){
                if(nums[i]%j==0){
                    divs.add(j);
                    count++;
                    if(count>4)break;
                }
            }
            divisor.add(divs);
        }
        int sum=0;
        for(int i=0;i<divisor.size();i++){
            if(divisor.get(i).size()==4){
                for(int j=0;j<4;j++){
                    sum+=divisor.get(i).get(j);
                }
            }
        }
        System.out.println(divisor);
        return sum;
    }
    public static void main(String[] args) {
        int[]nums={21,4,7};
        System.out.println(sumFourDivisors(nums));
    }
}
