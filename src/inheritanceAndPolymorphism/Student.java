package inheritanceAndPolymorphism;

public class Student extends User {
    //all user attributes
    //all user methods
    double psp;
    double attendance;

    //total attributes -> 6[User] + 2 = 8
    //total methods -> 1[User] + 0 = 1

    public void attendLecture(String lectureName){
        System.out.println("Student is attending lecture : " + lectureName);
    }

    public void attendLecture(int lectureNo){
        System.out.println("Student is attending lecture : " + lectureNo);
    }

    public void attendLecture(){
        System.out.println("Student is learning from the lecture");
    }
}

// child class extends Parent class
