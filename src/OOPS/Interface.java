package OOPS;
interface  Computer{
    void code();
}
class Laptop implements  Computer{
    public void code(){
        System.out.println("Code Compile Run");
    }
}
class Desktop implements Computer{
    public void code(){
        System.out.println("Code Compile Run : Faster");
    }
}
class Dev{
    public void devApp(Computer lap){
        lap.code();
    }
}
interface AA{
    void show();
    void config();
    int age=44;
}
class BB implements AA{
    public void show(){
        System.out.println("IN SHOW");
    }
    public void config(){
        System.out.println("IN CONFIG");
    }
}
public class Interface {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();


        Dev Gaurav = new Dev();
        Gaurav.devApp(desk);

        AA obj ;
        obj = new BB();
        BB obj11 = new BB();
        System.out.println(obj11.age);
    }
}
