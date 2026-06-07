package OOPS;

public class fraction {
    public static int gcd(int num, int dem){
        int min =Math.min(num,dem);
        for(int i =min;i>=1;i--){
            if(num%i==0 && dem%i==0) return i;
        }
        return min;
    }
    public static class Fraction{
        int num;
        int dem;
        public Fraction(){

        }
        public Fraction(int num,int dem){
            this.num=num;
            this.dem=dem;
            simplify();
        }
        public void simplify(){//divide the num and  num by hcf of both we will get the simplified fraction
          int hcf=gcd(num,dem);
          num /=hcf;
          dem /=hcf;

        }

    }

    public static void main(String[] args) {
//        Fraction f1=new Fraction(3,7);
//        System.out.println(f1.num+"/"+f1.dem);
        Fraction f2=new Fraction(35,21);
        System.out.println(f2.num+"/"+f2.dem);
    }
}
