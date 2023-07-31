package javaOopsAndMultiThreading.inheritanceAndPolymorphism;

public class C extends B{
    int z;

    public C(int x, int y, int z){
        super(x,y); //super calls the parent constructor of C, ie, Constructor of B, and passes the value of Y
        this.z = z;
    }

    public void helloC(){
        System.out.println("Hello world from C");
        super.helloB(); // it will call the parent class implementation of helloB
        super.helloA(); // it will call the overridden implementation of helloA inside immediate parent B
        this.helloB(); // calling helloB implementation of the current class
        this.helloA();
        super.helloAOriginal();
    }

    //overriden method
    public void helloB(){
        System.out.println("Hello world from B but from inside of C");
    }

    public void helloA(){
        System.out.println("Hello world from A but from inside of C");
    }
}

// C is child of B, B is child of A