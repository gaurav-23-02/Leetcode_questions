package BitManipulation;

public class evenElementOR {
    public static int evenNumberBitwiseORs(int[] nums) {
        int or=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                or=or|nums[i];
            }
        }
        return or;
    }

    public static void main(String[] args) {
        int[]nums={1,2,3,4,55,6};
        System.out.println(evenNumberBitwiseORs(nums));
    }
}
