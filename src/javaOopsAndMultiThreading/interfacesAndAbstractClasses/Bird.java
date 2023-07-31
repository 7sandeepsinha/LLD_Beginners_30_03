package javaOopsAndMultiThreading.interfacesAndAbstractClasses;

public abstract class Bird {
    int noOfLegs;
    int noOfWings;

    public abstract void eat();

    public void sleep(){
        System.out.println("Bird is sleeping");
    }

    public void breathe(){
        System.out.println("Bird is breathing");
    }
}
