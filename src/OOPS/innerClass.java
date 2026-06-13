package OOPS;
abstract class X{
    public abstract void show();
}
class Outer{
    int age;
    public void show(){
        System.out.println("In Outer Class");
    }
    class Inner{
        public void config(){
            System.out.println("In Inner Class");
        }
    }
}
public class innerClass{
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.show();
        Outer.Inner obj1 = obj.new Inner();
        obj1.config();
        Outer obj2 = new Outer(){
            public void show(){
                System.out.println("In a New Show");
            }
        };
        obj2.show();
        X objx = new X() {
            public void show() {
                System.out.println("In a Abstract Class");
            }
        };
        objx.show();
    }
}
