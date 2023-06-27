package designPatterns.strategy;

public class Client {
    public static void main(String[] args) {
        Maps maps = new Maps();
        maps.getPath("Patna", "Delhi", TransportationMode.WALK);
    }
}
