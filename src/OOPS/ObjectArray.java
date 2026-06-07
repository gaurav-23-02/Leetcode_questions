package OOPS;
class Students{
    int rollNo;
    String name;
    int marks;
}

public class ObjectArray {


    public static void main(String[] args) {
        Students s1 = new Students();
        s1.rollNo=1;
        s1.name="Ram";
        s1.marks=67;

        Students s2 = new Students();
        s2.rollNo=2;
        s2.name="shyam";
        s2.marks=97;

        Students students[]=new Students[2];
        students[0]=s1;
        students[1]=s2;
        for(int i=0;i<students.length;i++){
            System.out.println(students[i].name );
        }
    }
}
