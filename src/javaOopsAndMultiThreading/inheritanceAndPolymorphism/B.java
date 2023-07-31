package javaOopsAndMultiThreading.inheritanceAndPolymorphism;

public class B extends A {
    int y;

    public B(int x,int y) { //B(int,int)
        super(x);
        this.y = y;
    }

    public void helloB(){
        System.out.println("Hello World from B");
    }

    //overriden
    public void helloA(){
        System.out.println("Hello world from A but from inside of B");
    }

    public void helloAOriginal(){
        super.helloA();
    }


}
