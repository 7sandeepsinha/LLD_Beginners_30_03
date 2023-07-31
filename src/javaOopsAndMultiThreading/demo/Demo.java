package javaOopsAndMultiThreading.demo;

import javaOopsAndMultiThreading.encapsulation.Student;

public class Demo {
    public static void main(String[] args) {
        Student s = new Student(); // created an object of Student class
        s.id = 1;
        s.marks = 100;
        s.name = "Ananth";

        System.out.println(s.id);
        System.out.println(s.marks);
        System.out.println(s.name);

        s.printDetails();
    }
}
