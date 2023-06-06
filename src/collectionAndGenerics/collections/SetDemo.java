package collectionAndGenerics.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
    Set<Integer> set;

    public SetDemo(Set<Integer> set) {
        this.set = set;
    }

    public void setActions(){
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(null);
        set.add(30);
        System.out.println("SET : " + set);
        System.out.println("SET size: " + set.size());
        LinkedHashSet<Integer> linkedSet = new LinkedHashSet<>();
        linkedSet.add(100);
        linkedSet.add(200);
        linkedSet.add(300);
        linkedSet.add(400);
        System.out.println("LinkedSet" + linkedSet);

    }
}
