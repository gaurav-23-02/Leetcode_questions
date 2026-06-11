package OOPS;
class Human{
    private int age;
    private String name;

    public int getAge(){//getter
        return age;
    }
    public String getName(){//getter
        return name;
    }
    public void  setAge(int x){
        age = x;
    }
    public void setName(String s){
        name=s;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(19);obj.setName("Gaurav");
        System.out.println(obj.getName()+" : "+obj.getAge());
    }
}
