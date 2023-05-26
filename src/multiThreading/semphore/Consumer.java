package multiThreading.semphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
    private Queue<Shirt> store;
    private int maxSizeOfStore;
    private String name;
    private Semaphore semaForProducer;
    private Semaphore semaForConsumer;

    public Consumer(Queue<Shirt> store, int maxSizeOfStore, String name, Semaphore semaForProducer, Semaphore semaForConsumer) {
        this.store = store;
        this.maxSizeOfStore = maxSizeOfStore;
        this.name = name;
        this.semaForProducer = semaForProducer;
        this.semaForConsumer = semaForConsumer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                semaForConsumer.acquire();
                store.remove(); // store -> queue.remove() -> remove the first item from queue
                System.out.println(name + " : bought. Total shirt available : " + store.size());
                semaForProducer.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
