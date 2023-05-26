package multiThreading.atomicDataType;

public class Count {
    int count;

    public Count(int count) {
        this.count = count;
    }

    public int incrementAndGet(){
        count++;
        return count;
    }
}
