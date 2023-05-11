package interfacesAndAbstractClasses;

public class Sparrow extends Bird implements IFlyable{
    public void eat(){
        System.out.println("Sparrow is eating");
    }
    public void fly(){
        System.out.println("Sparrow is flying");
    }
}
