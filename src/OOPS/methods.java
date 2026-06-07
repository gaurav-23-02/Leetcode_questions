package OOPS;

class Calculator{
    int instanceVariable=99;//instance Variable stored in heap in JVM
    public int sum(int x,int y){//x and y here are local variable declared inside the method stored in stack memory in JVM
        return x+y;
    }
    public int sub(int x,int y){
        return x-y;
    }
}

public class methods {
    public static void main(String[] args) {
        Calculator num = new Calculator();//the new object is created in heap with memory location in stack
        int x=5;
        int y=3;
        System.out.println(num.instanceVariable);
        System.out.println(num.sum(x,y));
        System.out.println(num.sub(x,y));
    }

}
