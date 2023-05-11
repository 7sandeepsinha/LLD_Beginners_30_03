package interfacesAndAbstractClasses;

public class Crow extends Bird implements IFlyable{
    @Override
    public void eat(){
        System.out.println("Crow is eating");
    }

    @Override
    public void fly() {
        System.out.println("Crow is flying");
    }
}
