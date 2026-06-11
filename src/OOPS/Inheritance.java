package OOPS;

import org.w3c.dom.ls.LSOutput;

class Calc{
    public int add(int a,int b){
        return a+b;
    }
    public int mul(int a,int b){
        return a*b;
    }

}
class AdvCalc extends Calc{
    public int sub(int a,int b){
        return a-b;
    }
    public int div(int a,int b){
        return a/b;
    }
}
class SciCalc extends AdvCalc{
    public double power(double a, double b){
        return Math.pow(a,b);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        int x = obj.add(5,2);
        SciCalc obj1 = new SciCalc();
        int m=obj1.add(2,8);
        System.out.println(x);
        System.out.println(m);
    }
}