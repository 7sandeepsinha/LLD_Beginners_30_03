package staticAndFinal;

import javax.swing.text.Style;

public class Client {
    public static void main(String[] args) {
        // helloWorld(); -> this does not work, as helloWorld is non-static and being called from static instance
        Student s = new Student(1);
        //s.id = 2 -> will not work as it is a final attribute
        s.attendInterview();
        Student.schoolName = "ABC school";
        System.out.println(Student.schoolName);
        Student.hello();
        //Student.courseName = "ICSE"; -> not allowed
        System.out.println(s.schoolName); // can access static using className and object both
    }

    public void helloWorld(){
        System.out.println("Hello world");
    }
}

