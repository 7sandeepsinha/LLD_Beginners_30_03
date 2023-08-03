package designPatterns.strategy;

public class Client {
    public static void main(String[] args) {
        Maps maps = new Maps();
        maps.getPath("Patna", "Delhi", TransportationMode.WALK);
    }
}
/*
    Created an interface with method for implementation
    Created the classes with the actual impl
    Optional -> Make the classes singleton
    Factory class to get object of actual impl class
 */