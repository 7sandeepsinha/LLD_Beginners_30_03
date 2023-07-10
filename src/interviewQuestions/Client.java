package interviewQuestions;

import java.io.Serializable;

public class Client implements Serializable {

    public static void main(String[] args) {
        Thread t = new Thread(new Runnable(){
            public void run(){
                System.out.println("Sorter -> Implementation logic inside run method");
            }
        });
        System.out.println(t.getName());
        t.start();

        Bird b = new Bird(){
            public void fly(){
                System.out.println("Bird is flying");
            }
            public void eat(){
                System.out.println("Bird is eating");
            }
        };
        b.fly();
        b.eat();
        demo();
    }

    public static void demo(){
        Employee e = new Employee(){
            public void working(){
                System.out.println("Employee is working");
            }
        };
        Employee e2 = (() -> System.out.println("Employee is working"));
//        Employee e2 = (() -> {
//            System.out.println("Employee is working");
//            System.out.println("Employee is resting");
//            }
//        );

        e.working();

        Printer<String> p = (s) -> System.out.println(s);
        p.print("Hello world");
        Adder adder = ( (a,b) -> a+b);
        int result = adder.add(10,6);
        System.out.println(result);
    }
}
// break -> 8:25 AM