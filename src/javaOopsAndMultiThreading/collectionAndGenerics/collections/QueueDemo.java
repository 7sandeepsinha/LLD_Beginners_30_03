package javaOopsAndMultiThreading.collectionAndGenerics.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public void queueActions(){
        Queue<Integer> queue = new LinkedList<>();
        System.out.println("QUEUE : " + queue);
        queue.add(1);
        System.out.println("QUEUE : " + queue);
        queue.add(2);
        System.out.println("QUEUE : " + queue);
        queue.add(3); // can throw illegal state exception if breaching capacity
        System.out.println("QUEUE : " + queue);
        queue.offer(4); // will not insert but wont also throw exception if breaching capacity
        System.out.println("QUEUE : " + queue);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.remove(); // might throw exception if queue is empty, comes from queue, removes the head of the queue
        System.out.println("QUEUE : " + queue);
        queue.remove(4); // this remove method comes from linkedlist
        System.out.println("QUEUE : " + queue);
        queue.poll(); // does not throw exception
        System.out.println("QUEUE : " + queue);
        System.out.println(queue.element()); //return the head element without removing it , throws exception
        System.out.println(queue.peek()); // return the head element without removing it, does not throw exception
    }
}

// add, remove and element -> throw exception
// offer, poll and peek -> dont throw exception
