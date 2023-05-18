package multiThreading;

public class Adder implements Runnable{
    public int a;
    public int b;

    public Adder(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        System.out.println("Thread name : " + Thread.currentThread().getName());
        System.out.println("Addition result : " + (a+b) );
    }
}
