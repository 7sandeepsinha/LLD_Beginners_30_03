package multiThreading.synchronisation;

public class SynchronisedMethodCount {
    private int value = 0;

    public synchronized void increment(){
            value++;
    }

    public int getValue(){
        return value;
    }
}