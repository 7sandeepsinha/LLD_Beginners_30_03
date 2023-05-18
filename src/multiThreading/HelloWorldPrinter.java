package multiThreading;

public class HelloWorldPrinter implements Runnable{
    @Override
    public void run() {
        System.out.println("Current thread : " + Thread.currentThread().getName());
        System.out.println("Hello world is running from the new thread");
    }
}
