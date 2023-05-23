package multiThreading.callable;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ArrayAdder adder1 = new ArrayAdder(10);
        ArrayAdder adder2 = new ArrayAdder(20);

        // Thread t1 = new Thread(adder1); //thread does not accept callable
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Future<Long> futureSum1 = executor.submit(adder1);
        Future<Long> futureSum2 = executor.submit(adder2);
        //get the actual values from the futures
        long s1 = futureSum1.get();
        long s2 = futureSum2.get();


        executor.shutdown();
        System.out.println("Final result : " + (s1 + s2));
    }
}
