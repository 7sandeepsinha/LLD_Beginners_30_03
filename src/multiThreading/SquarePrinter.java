package multiThreading;

public class SquarePrinter implements Runnable{
    public int n;

    public SquarePrinter(int n) {
        this.n = n;
    }


    @Override
    public void run() {
        System.out.println("Thread name : " + Thread.currentThread().getName());
        System.out.println("Number square : " + (n*n));
    }
}
