package javaOopsAndMultiThreading.interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamsDemo {
    public void demo(){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,80,91,23,45,5,67,8);
        //filter out all the even numbers
        List<Integer> evenList = new ArrayList<>();
        for(int i : numbers){
            if(i%2 == 0)
                evenList.add(i);
        }
        List<Integer> evenNumber = numbers.stream()
                .filter(i -> i % 2 == 0)
                .sorted()
                .toList();
        List<Integer> oddNumber = numbers.stream()
                .filter(i -> i % 2 != 0)
                .toList();
        List<Integer> evenNumberMoreThan10 = numbers.stream()
                .filter(i -> i % 2 == 0)
                .filter(i -> i>10)
                .toList();

        // LIST -> 1 2 12 3 4 5
        // 1 2 12 3 4 5 ->
        // [12]
        System.out.println("EVEN : " + evenNumber);
        System.out.println("EVEN more than 10 : " + evenNumberMoreThan10);
        System.out.println("ODD : " + oddNumber);
    }

    public static void main(String[] args) {
        StreamsDemo demo = new StreamsDemo();
        demo.demo();
    }
}
// Streams have intermediary and terminal operations
// Terminal operations are the last part of the stream, and cant have any more methods after them.
