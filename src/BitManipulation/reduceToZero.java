package BitManipulation;

public class reduceToZero {
    public static int numberOfSteps(int num) {
        int count=0;
        if(num%2!=0){
            num-=1;
            count++;
        }
        while(num>0){
            if(num%2==0){
                num=num>>1;
                count++;
            }
            else{
                num=num-1;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int num=14;
        System.out.println(numberOfSteps(num));
    }
}
