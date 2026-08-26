package recursion;

public class checkIfArrayIsSorted {
    public static boolean helper(int[]nums,int i){
        if(i==nums.length-1)return true;
        if(nums==null||nums.length<=1)return true;
        if(nums[i]>nums[i+1])return false;
        return helper(nums,i+1);
    }
    public static boolean checkSort(int[]nums){
        int i=0;
        return helper(nums,i);
    }
    public static void main(String[] args) {
        int[]nums={1,2,3,4,5};
        System.out.println(checkSort(nums));
    }

}
