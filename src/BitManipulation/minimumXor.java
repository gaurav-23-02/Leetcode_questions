package BitManipulation;

public class minimumXor {
    public static int minOperations(int[] nums, int k) {
        int x=0;
        for(int i=0;i<nums.length;i++){
            x^=nums[i];
        }
        if(x==k){
            return 0;
        }
        String s=Integer.toBinaryString(x);
        String k1=Integer.toBinaryString(k);
        int maxLen = Math.max(s.length(), k1.length());

        while (s.length() < maxLen) {
            s = "0" + s;
        }

        while (k1.length() < maxLen) {
            k1 = "0" + k1;
        }
        System.out.println(k1);
        System.out.println(s);
        int count=0;
        for(int i=0;i<Math.min(s.length(),k1.length());i++){
            if(s.charAt(i)!=k1.charAt(i)){
                count++;
            }
        }
        count=count+Math.abs(s.length()-k1.length());
        return count;
    }

    public static void main(String[] args) {
        int[]nums={9,7,9,14,8,6};
        System.out.println(minOperations(nums,1));
    }
}
