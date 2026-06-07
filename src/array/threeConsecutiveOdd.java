package array;

public class threeConsecutiveOdd {
    public static boolean threeConsecutiveOdds(int[] arr) {
        int currcount=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0||arr[i]==1){
                currcount++;
                if(currcount>max){
                    max=currcount;
                }
            }
            else{
                currcount=0;
            }
        }
        if(max>=3){
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String[] args) {
        int[]arr={1,2,34,3,4,5,7,23,12};
        System.out.println(threeConsecutiveOdds(arr));

    }
}
