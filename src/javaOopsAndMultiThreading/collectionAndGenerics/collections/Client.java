package javaOopsAndMultiThreading.collectionAndGenerics.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Client {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(5);
        ListDemo listDemo = new ListDemo(arrayList);
        listDemo.listActions();

        HashSet<Integer> set = new HashSet<>();
        SetDemo setDemo = new SetDemo(set);
        setDemo.setActions();

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"Deepan");
        map.put(2,"Priyanka");
        map.put(2,"Omkar"); // when we insert the same key with a value, current value gets overridden
        System.out.println(map);
    }
}
//List, actions, types and internal working
//Set, actions, types and internal working
//HashMap internal working