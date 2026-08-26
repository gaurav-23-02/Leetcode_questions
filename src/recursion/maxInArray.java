package recursion;

public class maxInArray {
    public static int helper(int[]nums,int i){
        if(i==nums.length-1){
            return nums[i];
        }
        int restMax = helper(nums,i+1);
        return Math.max(nums[i],restMax);
    }
    public static int max(int[]nums){
        int i=0;
        return helper(nums,i);
    }
    public static void main(String[] args) {
        int[]nums={5,6,7,8,9,10};
        System.out.println(max(nums));
    }
}
