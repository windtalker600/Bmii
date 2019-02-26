package com.max.bmii;

import com.max.bmii.hello.Person;
import com.max.bmii.hello.Student;

public class Tester {
    public static void main(String[] args) {
        Student stu = new Student("001","Mica",60,80);
        Student stu1 = new Student("002","Eric",35,60);

        stu.print();
        stu1.print();

        /*stu.setId("001");
        stu.setName("Max");
        stu.setMath(60);
        stu.setEnglish(80);*/

//        System.out.println("Hello Bmii");
        /*Person person = new Person();
        person.hello();
        person.hello("Mica");
        person.setWeight(68);
        person.setHeight(1.62f); //變為32位元的float
        System.out.println(person.bmi());*/
    }
}
