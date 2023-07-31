package javaOopsAndMultiThreading.multiThreading.atomicDataType;

import java.util.concurrent.atomic.AtomicInteger;

public class Client {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        Count count = new Count(0);
        AtomicCount atomicCount = new AtomicCount(atomicInteger);

        IncrementerCount incrementerCount = new IncrementerCount(count);
        IncrementerAtomicCount incrementerAtomicCount = new IncrementerAtomicCount(atomicCount);

        Thread t1 = new Thread(incrementerCount);
        Thread t2 = new Thread(incrementerCount);

        Thread t3 = new Thread(incrementerAtomicCount);
        Thread t4 = new Thread(incrementerAtomicCount);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
