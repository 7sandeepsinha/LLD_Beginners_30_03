package javaOopsAndMultiThreading.multiThreading.synchronisation;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Count {
    private int value = 0;
    //properties of lock should not be changed once created, so lock is final
    private final Lock lock; // mutually exclusive lock or, mutex lock

    public Count(){
        lock = new ReentrantLock();
    }

    public void increment(){
            lock.lock();
            value++;
            lock.unlock();
    }

    public int getValue(){
        return value;
    }
}
