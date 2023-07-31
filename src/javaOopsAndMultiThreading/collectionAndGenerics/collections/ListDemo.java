package javaOopsAndMultiThreading.collectionAndGenerics.collections;

import java.util.ArrayList;
import java.util.Iterator;
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

        List<Integer> list = new ArrayList<>(10);
        System.out.println("Size -> " + list.size());
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("Add -> " + list.add(5));
        System.out.println("List contains -> " + list.contains(4));
        list.add(6);
        list.add(5);
        list.add(6);
        System.out.println("List : " + list);
        Integer x = 6;
        list.remove(x);
        System.out.println("List : " + list);
        list.set(2,10);
        System.out.println("List : " + list);
        list.add(2,20);
        System.out.println("List : " + list);
        String listString = list.toString();
        System.out.println(listString);
    }

    public void printListWithForLoop(List<Integer> list){
        System.out.println("Print with a normal for loop");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

    public void printListWithEnhancedForLoop(List<Integer> list){
        System.out.println("Print with enhanced for loop");
        for(Integer i : list){
            System.out.println(i);
        }
    }

    public void printListWithIterator(List<Integer> list){
        System.out.println("Print with an iterator");
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
