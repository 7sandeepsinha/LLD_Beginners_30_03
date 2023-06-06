package collectionAndGenerics.collections;

import inheritanceAndPolymorphism.A;

import java.util.List;

public class ListDemo {
    List<Integer> numberList;

    public ListDemo(List<Integer> numberList) {
        this.numberList = numberList;
    }

    public void listActions(){
        numberList.add(11); //0
        numberList.add(22); //1
        numberList.add(30); //2
        numberList.add(30); //2
        numberList.add(30); //2
        numberList.add(30); //2

        System.out.println(numberList);
        System.out.println("SIZE : " + numberList.size());
        System.out.println("CONTAINS 50: " + numberList.contains(50));
        System.out.println("CONTAINS 30: " + numberList.contains(30));
        int currentVal = numberList.set(2,40);
        System.out.println("CURRENT VAL : " + currentVal);
        numberList.add(5,100);
        System.out.println(numberList);
    }
}
