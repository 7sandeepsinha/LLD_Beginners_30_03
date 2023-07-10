package exceptionHandling;

import com.sun.security.jgss.GSSUtil;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.calculate();
        try {
            int result = 5/5;
            System.out.println("RESULT : " + result);
        } catch (Exception e) {
            System.out.println("Some exception has occured");
        } finally {
            System.out.println("Code in finally block");
        }
    }
}
// Can we have a try block without a catch block -> YES  [either finally or catch]
// try block should have either catch or finally after it
// Can we have a catch block without a try block -> NO
// Can we finally without catch block -> YES
// Can we finally without try block -> NO

// Possible combinations -> [try,catch] [try,finally] [try,catch,finally] [try,catch,catch ....]

// Finally block always executes whether there is an exception or not
// Finally block will always be executed as long as system is running