package javaOopsAndMultiThreading.multiThreading;

public class ClientJoinDemo {
    public static void main(String[] args) throws InterruptedException {
        HelloWorldPrinter hwp = new HelloWorldPrinter();
        HelloWorldPrinterWithWait hwpWithWait = new HelloWorldPrinterWithWait();
        Thread t = new Thread(hwp);
        Thread t2 = new Thread(hwpWithWait);
        t.start();
        t2.start();
        t.join(); //from main thread calling t thread, so main will wait until t completes
        System.out.println("Printing this line from main : " + Thread.currentThread().getName());
    }
}
