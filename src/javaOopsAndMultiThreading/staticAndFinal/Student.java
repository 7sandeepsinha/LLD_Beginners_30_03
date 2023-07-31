package javaOopsAndMultiThreading.staticAndFinal;

public class Student {
    static final String courseName = "CBSE";
    final int id; //id should be present when the object is created, and should not change ever, so made it final
    String name;
    int marks;

    static String schoolName;

    public Student(int id) {
        this.id = id;
    }

    public final void attendInterview(){
        System.out.println("Attend written test");
        System.out.println("Attend interview");
        System.out.println("Attend HR roud");
        System.out.println("Get offer letter");
    }

    public static void hello(){
        System.out.println("Hello from student");
    }
}


//final - attribute -> can only set it while object creation and cant change
//final - method -> cant override the method
//final - class -> cant inherit the class

//for a final attribute, when the object is getting created, the attribute should hold some value
//default constructor will not work with final attribute