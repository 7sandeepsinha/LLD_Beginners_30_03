package javaOopsAndMultiThreading.collectionAndGenerics.genericsDemo;

public class Printer<T> { // Printer<Integer>
    T itemToPrint;
    public Printer(T itemToPrint) {
        this.itemToPrint = itemToPrint;
    }
    public void print(){
        System.out.println(itemToPrint);
    }
}
