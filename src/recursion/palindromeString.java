package recursion;

public class palindromeString {
    public static boolean palindrome(String s){
        if(s.length()<=1){
            return true;
        }
        if(s.charAt(0)!=s.charAt(s.length()-1)){
            return false;
        }
        return palindrome(s.substring(1,s.length()-1));
    }
    public static String reverse(String s){
        if(s.length()<=1){
            return s;
        }
        return reverse(s.substring(1))+s.charAt(0);
    }
    public static int helper(int[]nums,int i){
        if(i==nums.length)return 0;
        return nums[i]+helper(nums,i+1);
    }
    public static int helpermax(int[]nums,int i){
        if(i==nums.length-1)return nums[i];
        int maxrest = helper(nums,i+1);
        return Math.max(nums[i],maxrest);
    }
    public static int max(int[]nums){
        int i=0;
        return helpermax(nums,i);
    }
    public static int arraySum(int[]nums){
        int i=0;
        return helper(nums,i);
    }
    public static void main(String[] args) {
        String s="racecar";
        System.out.println(palindrome(s));
        System.out.println(reverse(s));
        int[]nums={1,2,3,4,5};
        System.out.println(arraySum(nums));
        System.out.println(max(nums));
    }
}
