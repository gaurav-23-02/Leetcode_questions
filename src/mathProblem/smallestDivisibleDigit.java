package mathProblem;

public class smallestDivisibleDigit {
    public static int product(long n){
        int product=1;
        while(n>0){
            if(n%10==0){
                return -1;
            }
            product*=n%10;
            n/=10;
        }
        return product;
    }
//    public static int smallestNumber(int n, int t) {
//        while(true){
//            if(product(n)%t==0)
//                return n;
//            n++;
//        }
//    }
    public static String smallestNumber2(String num, long t) {
        long x= Long.parseLong(num);
        for(long i=x;i<200000;i++){
            if(product(i)%t==0){
                return i+"";
            }
        }
        return "";
    }

    public static void main(String[] args) {
//        System.out.println(smallestNumber(15,3));
        System.out.println(smallestNumber2("1234",256));
    }
}
