package OOPS;

public class access_modify {
    public static void change(classcheck.Student s) {
        s.name="rohan";

    }

    public static void main(String[] args) {
        classcheck.Student s1=new classcheck.Student();
        s1.name="gaurav";
        s1.percent=98.3;
        s1.rno=23;
        System.out.println(s1.name);
        System.out.println(s1.percent);
        System.out.println(s1.rno);
        System.out.println(s1.sclname);

        classcheck.Student s2=new classcheck.Student("rahul",12,65);
        System.out.println(s2.name);
        System.out.println(s2.percent);
        System.out.println(s2.rno);
        System.out.println(s2.sclname);
//
//
//        s1.name="gaurav";
//        s1.percent=92.1;
//        s1.setRno(76);//setter
//        System.out.println(s1.getRno());//getter

    }

}
