package javaOopsAndMultiThreading.interfacesAndAbstractClasses;

public class PersonalVehicle implements IBike, ICar{

    public void run(){
        System.out.println("My personal vehicle is running");
    }
}
