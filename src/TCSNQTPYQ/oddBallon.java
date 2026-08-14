package TCSNQTPYQ;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class oddBallon {
    public static char oddBall(char[] nums){
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Character ,Integer>entry:map.entrySet()){
            if(entry.getValue()%2!=0){
                return entry.getKey();
            }
        }
        return 'b';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[]nums=new char[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.next().charAt(0);
        }
        System.out.println(oddBall(nums));
    }
}
