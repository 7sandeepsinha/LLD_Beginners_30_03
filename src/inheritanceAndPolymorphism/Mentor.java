package inheritanceAndPolymorphism;

public class Mentor extends User {
    int noOfSessions;
    double rating;

    //total attributes -> 6[User] + 2 = 8
    //total methods -> 1[User] + 0 = 1
    public void attendLecture(){
        System.out.println("Mentor is creating notes from the lecture");
    }
}
