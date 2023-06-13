package designPatterns.singleton;
public class SingletonMultiThreaded {
    private static SingletonMultiThreaded instance;
    private int counter;

    private SingletonMultiThreaded(){
        counter = 0;
    }

    public static SingletonMultiThreaded getInstance(){
        if(instance == null){
            synchronized (SingletonMultiThreaded.class) {
                if (instance == null) {
                    instance = new SingletonMultiThreaded();
                }
            }
        }
        return instance;
    }

    public void makeConnection(){
        if(counter < 3){
            counter++;
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
