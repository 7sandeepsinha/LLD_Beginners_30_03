package multiThreading.synchronisation;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();
        IncrementCount incrementCount1 = new IncrementCount(count);
        IncrementCount incrementCount2 = new IncrementCount(count);
        Thread t1 = new Thread(incrementCount1);
        Thread t2 = new Thread(incrementCount2);

        t1.start();
        t2.start();



        System.out.println(count.getValue());


    }
}
