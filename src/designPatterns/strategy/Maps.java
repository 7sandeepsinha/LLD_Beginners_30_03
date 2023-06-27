package designPatterns.strategy;

public class Maps {
    public void getPath(String source, String destination, TransportationMode mode){
        PathCalculatorStrategy pathCalculatorStrategy = PathCalculatorFactory.getPathCalculator(mode);
        pathCalculatorStrategy.findPath(source, destination);
    }
}

// Sorter -> sort(int[] array)
// BubbleSorter implement Sorter
// MergeSorter implement Sorter
// SorterFactory -> objects
// Main -> use get foctory get sorter object, then use sorter object to sort