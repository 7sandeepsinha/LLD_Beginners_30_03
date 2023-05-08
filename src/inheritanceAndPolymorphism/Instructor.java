package inheritanceAndPolymorphism;

public class Instructor extends User {
    int noOfLectures;
    double rating;

    //total attributes -> 6[User] + 2 = 8
    //total methods -> 1[User] + 0 = 1
    public void attendLecture(){
        System.out.println("Instructor is teaching in the lecture");
    }
}
