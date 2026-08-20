package TCSNQTPYQ;
import java.util.*;

public class countPriorGreater {
    public static void ballons(char[]nums){
        HashMap<Character,Integer>map = new LinkedHashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int oddCount=0;
        for(int x:map.values()){
            if(x%2!=0){
                oddCount++;
            }
        }
        if(oddCount==0){
            System.out.print("All are even");
            return;
        }
        for(Map.Entry<Character,Integer>entry:map.entrySet()){
            if(entry.getValue()%2!=0){
                System.out.println(entry.getKey());
                return;
            }
        }
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        char[] nums= new char[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.next().charAt(0);
        }
        ballons(nums);
    }
}
