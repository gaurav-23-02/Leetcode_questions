package TCSNQTPYQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class removeALL {
    public static int remove(int[]nums){
        Arrays.sort(nums);
        int count=0;
        int i=0;
        int j=nums.length-1;
        while(i<j){
            if(nums[i]!=nums[j]){
                count+=1;
            }
            else{
                count+=2;
            }
            i++;
            j--;
        }
        List<int[]> list = new ArrayList<>();

        if(nums.length%2==0){
            return count;
        }
        else{
            return count+=1;
        }

    }
    public static void main(String[] args) {
        int[]nums={2,2,3,3,1,1};
        System.out.println(remove(nums));
    }
}
