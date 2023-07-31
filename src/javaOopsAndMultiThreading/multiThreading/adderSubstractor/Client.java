package javaOopsAndMultiThreading.multiThreading.adderSubstractor;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();
        Adder adder = new Adder(count);
        Substractor substractor = new Substractor(count);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(substractor);

        t1.start();
        t2.start();

        System.out.println("Value : " + count.val);
    }
}
