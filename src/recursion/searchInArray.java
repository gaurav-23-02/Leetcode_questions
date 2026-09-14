package recursion;

public class searchInArray {
    public static boolean helper(int i,int[]nums,int k){
        if(i>=nums.length){
            return false;
        }
        int target=nums[i];
        if(target==k)return true;
        return helper(i+1,nums,k);
    }
    public static boolean search(int[]nums,int k){
        return helper(0,nums,k);
    }
    public static void main(String[] args) {
        int[]nums={1,2,3,4,5,6};
        int k=0;
        System.out.println(search(nums,k));
    }
}
