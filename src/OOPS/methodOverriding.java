package OOPS;
class Cal{
    public int add(int x,int y){
        return x+y;
    }
}
class advCal extends Calc{
    public int add(int n1,int n2){
        return n1+n2+1;
    }
}
public class methodOverriding {
    public static void main(String[] args) {
        advCal obj = new advCal();
        System.out.println(obj.add(2,5));
    }
}
