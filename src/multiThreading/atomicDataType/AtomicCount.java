package multiThreading.atomicDataType;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCount {
    public AtomicInteger atomicInteger;

    public AtomicCount(AtomicInteger atomicInteger) {
        this.atomicInteger = atomicInteger;
    }
}
