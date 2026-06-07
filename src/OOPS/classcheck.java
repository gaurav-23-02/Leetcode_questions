package OOPS;

public class classcheck {
   public static class Student{
       public String name;
       int rno;
       double percent;
       final String sclname="DAV";
       public int getRno(){
           return rno;
       }
       public void setRno(int roll){//setter
           rno =roll;
       }
       public Student(){

       }
       //how to make a constructor
       public Student(String naam,int rollnumber,double per){//a function with  the same name as the clas
           name = naam;//is know  as constructor
           rno=rollnumber;
           percent=per;

       }
   }
}