package OOPS;
class Mobile{
    String Brand;
    int price;
    static String name;

    static{//static Block
        name="Phone";
        System.out.println("this is static  block");
    }

    Mobile(){
        Brand="";
        price=200;
        System.out.println("This is constructor running");
    }
    public void show(){//static variable
        System.out.println(Brand+" : "+price+" : "+name);
    }
    public static void show1(){//static method
        System.out.println("in static method");
    }
}
public class Static {
    public static void main(String[] args) throws ClassNotFoundException {
        Mobile obj1 = new Mobile();
        obj1.Brand="Apple";
        obj1.price=1500;
//        obj1.name="SmartPhone";


        Mobile obj2 = new Mobile();
        obj2.Brand="Samsung";
        obj2.price=1200;
//        obj2.name="SamrtPhone";
        Mobile.name="Phone";
        obj1.show();
        obj2.show();
        Mobile.show1();
        //Class.forName("Mobile");

    }

}
