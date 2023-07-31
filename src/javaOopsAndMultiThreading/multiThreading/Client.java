package javaOopsAndMultiThreading.multiThreading;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        HelloWorldPrinter hwp = new HelloWorldPrinter();
        Thread t = new Thread(hwp);
        t.start();
        //Thread.sleep(6000); // asking the main thread to pause execution for 3 secs
        System.out.println("Main method line thread : " + Thread.currentThread().getName());
        System.out.println("Hello world from main method");

        Adder adder = new Adder(10,20);
        Thread t1 = new Thread(adder);
        t1.start();

        //create 50 threads and for each thread print the square of the number 1 - 50
        for(int i=1;i<=50;i++){
            SquarePrinter squarePrinter = new SquarePrinter(i);
            Thread sqThread = new Thread(squarePrinter);
            sqThread.start();
        }
    }
}