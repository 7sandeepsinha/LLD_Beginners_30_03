package designPatterns.strategy;

public class Maps {
    public void getPath(String source, String destination, TransportationMode mode){
        PathCalculatorStrategy pathCalculatorStrategy = PathCalculatorFactory.getPathCalculator(mode);
        pathCalculatorStrategy.findPath(source, destination);
    }
}
