package javaOopsAndMultiThreading.exceptionHandling;

import java.util.Scanner;

public class Calculator {
    public void calculate(){
        while(true) {
            System.out.println("Choose an action");
            String action = "/";
            int result = 0;
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
            String str = null;
            try {
                result = x / y;
                return;
            } catch (ArithmeticException ae) { // specialised Exception -> above
                System.out.println("Please dont divide using a zero as denominator");
                return;
            } catch (NullPointerException ne) {
                System.out.println("The string is null");
            } catch (Exception e) {
                System.out.println("Exception has occured"); // generalised Exception > lower
            } finally {
                System.out.println("Code in finally block");
            }
            System.out.println("result : " + result);
        }
    }
}
