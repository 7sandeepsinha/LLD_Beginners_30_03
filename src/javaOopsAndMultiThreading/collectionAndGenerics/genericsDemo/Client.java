package javaOopsAndMultiThreading.collectionAndGenerics.genericsDemo;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        //integer print
        Printer<Integer> integerPrinter = new Printer<>(5);
        integerPrinter.print();

        //generics only works with objects and does not work with primitives
//        Printer<int> integerPrinter1 = new Printer<>(5);
//        integerPrinter.print();

        //double print
        Printer<Double> doublePrinter = new Printer<>(10.00);
        doublePrinter.print();
        List<Integer> list = new ArrayList<>();

        //Student print
        Printer<Student> studentPrinter = new Printer<>(new Student("Omkar",75));
        studentPrinter.print();
    }
}
