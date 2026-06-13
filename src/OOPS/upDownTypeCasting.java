package OOPS;

class Aa{
    public void show1(){
        System.out.println("IN Aa");
    }
}
class Bb extends Aa{
    public void show2(){
        System.out.println("In Bb");
    }
}
public class upDownTypeCasting {
    public static void main(String[] args) {
        double x = 4.5;
        int i = (int)x;//Typecasting
        System.out.println(i);
        Aa obj =new Bb();//Upcasting
        obj.show1();


        Bb obj1 = (Bb)obj;//Downcasting
        obj1.show2();

    }
}
