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
abstract class Car{
    public abstract void drive();
    public void playMusic(){
        System.out.println("Play music");
    }
}
class WagonR extends Car{
    public void drive(){
        System.out.println("Driving");
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

        Car obj2 = new WagonR();
        obj2.drive();
        obj2.playMusic();
    }
}
