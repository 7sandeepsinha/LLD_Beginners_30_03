package multiThreading;

public class HelloWorldPrinterWithWait implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Printing this from HelloWorldPrinterWithWait " + Thread.currentThread().getName() );
    }
}
