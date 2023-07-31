package javaOopsAndMultiThreading.inheritanceAndPolymorphism;

public class TA extends User {
    int problemsSolved;
    double rating;

    //total attributes -> 6[User] + 2 = 8
    //total methods -> 1[User] + 0 = 1
    public void attendLecture(){
        System.out.println("TA is solving doubts from the lecture");
    }
}
