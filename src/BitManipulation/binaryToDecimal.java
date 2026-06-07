package BitManipulation;

public class binaryToDecimal {
    public  static int binaryToDeci(String s){
        int num=0;
        int power=1;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                num=num+power;
            }
            power=power*2;

        }
        return num;

    }

    public static void main(String[] args) {
        String s ="100";
        System.out.println(binaryToDeci(s));
    }
}
