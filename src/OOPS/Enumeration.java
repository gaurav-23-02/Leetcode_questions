package OOPS;

enum Projects{
    Done,Working,Left,NoIDea;
}
class N{
    public void run(){
        System.out.println("Running in N");
    }
}
class M extends N{
    @Override
    public void run(){
        System.out.println("Running in M");
    }
}
@FunctionalInterface
interface functional{
    void show();
}
public class Enumeration {
    public static void main(String[] args) {
        Projects s = Projects.Done;
        System.out.println(s);
        Projects[]ss = Projects.values();
        for(Projects s1:ss){
            System.out.println(s1+" : "+s1.ordinal());
        }
        M obj = new M();
        obj.run();

    }
}
