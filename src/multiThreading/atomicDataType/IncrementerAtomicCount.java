package multiThreading.atomicDataType;

public class IncrementerAtomicCount implements Runnable{
    private AtomicCount atomicCount;

    public IncrementerAtomicCount(AtomicCount atomicCount) {
        this.atomicCount = atomicCount;
    }

    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            System.out.println("Thread name for atomic count : " + Thread.currentThread().getName());
            System.out.println("AtomicCount : " + atomicCount.atomicInteger.incrementAndGet());
        }
    }
}
