package inheritanceAndPolymorphism;

public class Client {
    public static void main(String[] args) {
        Student s = new Student();
        s.id = 1;
        s.name = "Ananth";
        s.address = "City A";
        s.phone = "1234567890";
        s.email = "ananth@email.com";
        s.password = "password";
        s.getDetails();
        s.attendLecture("LLD OOPs");

        TA t = new TA();
        t.id = 2;
        t.name = "Subham";
        t.address = "City A";
        t.phone = "1234567890";
        t.email = "Subham@email.com";
        t.password = "password";
        t.getDetails();

        System.out.println();
        System.out.println("---------------------");
        System.out.println("This is a string");
        System.out.println(100);
        System.out.println(100.11);
        System.out.println(100.1f);
        System.out.println(true);
        System.out.println('A');

        Calculator c = new Calculator();
        c.add(5,4);
        c.add(5.4,5.3);
        c.add(5.4,6);
        c.add(5,6.5);

        //User [parent] -> Student, TA, Mentor, Instructor [ child classes]
        User uStudent = new Student();
        User uTA = new TA();
        User uMentor = new Mentor();
        User instructor = new Instructor();

        ValidationService validationService = new ValidationService();
        System.out.println(validationService.verifyEmail(new Student())); //attributes in student -> 8
        System.out.println(validationService.verifyEmail(new TA()));
        System.out.println(validationService.verifyEmail(new Instructor()));
        System.out.println(validationService.verifyEmail(new Mentor()));

        Student student = new Student();
        student.attendLecture();

        Instructor instructor1 = new Instructor();
        instructor1.attendLecture();

        Mentor mentor = new Mentor();
        mentor.attendLecture();

        TA ta = new TA();
        ta.attendLecture();

        System.out.println("Please choose an option : 1-> Student, 2-> Ta");
        int option = 2;//user input
        if(option == 1){
            validationService.validateLectureAttendance(new Student());
        } else {
            validationService.validateLectureAttendance(new TA());
        }
    }
}
//start the lecture 7:05 AM
