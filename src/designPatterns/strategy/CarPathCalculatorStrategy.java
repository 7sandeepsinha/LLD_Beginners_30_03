package designPatterns.strategy;

public class CarPathCalculatorStrategy implements PathCalculatorStrategy {

    private static CarPathCalculatorStrategy instance;

    private CarPathCalculatorStrategy(){

    }

    public static CarPathCalculatorStrategy getInstance() {
        if(instance == null) {
            synchronized (CarPathCalculatorStrategy.class) {
                if (instance == null) {
                    instance = new CarPathCalculatorStrategy();
                }
            }
        }
        return instance;
    }


    @Override
    public void findPath(String source, String destination) {
        System.out.println("Path calculation via Car from : " + source + " to " + destination );
    }
}
