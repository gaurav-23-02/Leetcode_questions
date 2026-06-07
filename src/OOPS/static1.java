package OOPS;

public class static1 {
    class Student00{
        int no;
        String name;
        double percent;
        private static  int numeberofStudents;
        public Student00(int no,String name,double percent){
            this.no=no;
            this.name=name;
            this.percent=percent;
            numeberofStudents++;

        }
        public int getNumeberofStudents(){
            return numeberofStudents;
        }
    }

    public void  main(String[] args) {
        Student00 s1=new Student00(12,"aman",23);
        System.out.println(s1.numeberofStudents);
        Student00 s2=new Student00(13,"amman",23);
        System.out.println(s2.numeberofStudents);
        Student00 s3=new Student00(124,"am4an",23);
        System.out.println(s3.numeberofStudents);
        System.out.println();
        //after all the 3 objects are created the value of each have been changed to 3
        //because static only one dabba have been created and shared for all the three
        System.out.println(s1.numeberofStudents);
        System.out.println(s2.numeberofStudents);
        System.out.println(s3.numeberofStudents);
    }
}
