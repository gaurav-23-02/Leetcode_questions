package OOPS;

@FunctionalInterface
interface P{
    void show();
}
//class Q implements P{
//    public void show(){
//        System.out.println("In a Interface");
//    }
//}
@FunctionalInterface
interface MM{
    int sum(int i,int j);
}
public class LambdaExpressions {
     public static void main(String[] args) {
//         P obj = new P(){
//             public void show(){
//                 System.out.println("In a Show");
//             }
//         };
//         obj.show();
        P obj =()->{
            System.out.println("In A show");
        };
        obj.show();
        MM obj1 =(i,j)->i+j;
         System.out.println(obj1.sum(4,5));

    }
}
