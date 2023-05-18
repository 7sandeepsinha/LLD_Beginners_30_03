package multiThreading.callable;

import java.util.concurrent.Callable;

public class ArrayAdder implements Callable<Long> {

    int size;

    public ArrayAdder(int size) {
        this.size = size;
    }

    @Override
    public Long call() throws Exception {
        long sum = 0;
        for(int i=0;i<=size;i++){
            sum = sum + i;
        }
        return sum;
    }
}
