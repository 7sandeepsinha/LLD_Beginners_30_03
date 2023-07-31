package javaOopsAndMultiThreading.multiThreading.semphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    private Queue<Shirt> store;
    private int maxSizeOfStore;
    private String name;
    private Semaphore semaForProducer;
    private Semaphore semaForConsumer;

    public Producer(Queue<Shirt> store, int maxSizeOfStore, String name, Semaphore semaForProducer, Semaphore semaForConsumer) {
        this.store = store;
        this.maxSizeOfStore = maxSizeOfStore;
        this.name = name;
        this.semaForProducer = semaForProducer;
        this.semaForConsumer = semaForConsumer;
    }

    @Override
    public void run() {
        while(true){
            try {
                semaForProducer.acquire(); // reduce the number of producer allowed by 1
                store.add(new Shirt());
                System.out.println(name + " : produced. Total shirt available : " + store.size());
                semaForConsumer.release(); // increase the number of consumers allowed by 1
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
