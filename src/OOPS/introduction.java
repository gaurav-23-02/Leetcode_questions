package OOPS;

import java.util.*;

public class introduction {
    public static class Student {//creating a data type
        String name;
        int roll_number;
        float marks;
    }

    public static class Car {
        String name;
        int price;
        String type;
    }

    public static void main(String[] args) {
        //data of 5 students :{roll number , name ,mnarks}
        int[] roll_number = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];
        //all these are independent and not related to a single entity and not linked with each other
        //thus a class is required a named group of properties and functions
        Student Student1 = new Student();//declaration
        Student1.roll_number = 12;
        Student1.marks = 44;
        Student1.name = "gaurav";
        System.out.println(Student1.name);
        System.out.println(Student1.marks);
        System.out.println(Student1.roll_number);

        Car car1 = new Car();
        car1.name = "audi";
        car1.price = 100000;
    }
}


