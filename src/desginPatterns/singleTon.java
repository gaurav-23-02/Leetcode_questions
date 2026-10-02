package desginPatterns;

public class singleTon {
    int a;
    int b;

    private singleTon(){}
    private static singleTon obj = new singleTon();
    public int  sum(){
        return a+b;
    }
    public static singleTon getObj(){
        return obj;
    }

    public static void main(String[] args) {
        int a=5;
        int b=5;
        singleTon obj1 = new singleTon();
        obj1.a=5;
        obj1.b=5;
        System.out.println(obj1.sum());
        obj.a=10;
        obj.b=5;
        System.out.println(obj.sum());

    }
}
