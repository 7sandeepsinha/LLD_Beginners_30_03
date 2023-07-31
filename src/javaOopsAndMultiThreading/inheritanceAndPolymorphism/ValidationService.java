package javaOopsAndMultiThreading.inheritanceAndPolymorphism;

public class ValidationService {
    //In case of upcasting, the object holds all the possible attributes and methods,
    //but since we are using reference variable of parent class, we will only able to use
    //attributes and methods available in the parent class, even object contains more.
    public boolean verifyEmail(User user){
        //accepts a type of user reference variable. Since, upcasting is possible,
        // all the child objects of User can be upcasted to a user reference variable,
        // hence, we can use all objects of User for this method as well.
        String email = user.email;
        if(email == null)
            return false;
        else
            return true;
    }

    public void validateLectureAttendance(User user){ //Student obj, TA obj, Instructor obj, Mentor obj
        user.attendLecture();
        System.out.println("User has attended lecture");
    }
}
