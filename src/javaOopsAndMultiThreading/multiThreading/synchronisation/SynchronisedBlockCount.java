package javaOopsAndMultiThreading.multiThreading.synchronisation;

public class SynchronisedBlockCount {
    private int value = 0;

    public synchronized void increment(){
        synchronized (this) {
            value++;
        }
    }

    public int getValue(){
        return value;
    }
}
