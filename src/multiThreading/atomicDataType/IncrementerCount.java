package multiThreading.atomicDataType;

public class IncrementerCount implements Runnable{
    private Count count;

    public IncrementerCount(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            System.out.println("Thread name for count : " + Thread.currentThread().getName());
            System.out.println("Count : " + count.incrementAndGet());
        }
    }
}
