package designPatterns.prototypeRegistry;

public class Client {
    public static void main(String[] args) {
        Student studentApr23Proto = new Student();
        studentApr23Proto.setBatchName("Apr23");
        studentApr23Proto.setAvgBatchPsp(80);
        studentApr23Proto.setInstructorName("Naman");
        studentApr23Proto.setMonthOfEnrollment("0423");
        studentApr23Proto.setCurrentModule("DSA");

        Student studentMar23Proto = new Student();
        studentMar23Proto.setBatchName("Mar23");
        studentMar23Proto.setAvgBatchPsp(90);
        studentMar23Proto.setInstructorName("Sandeep");
        studentMar23Proto.setMonthOfEnrollment("0323");
        studentMar23Proto.setCurrentModule("DSA");

        StudentRegistry studentRegistry = new StudentRegistry();
        studentRegistry.register("Apr23", studentApr23Proto);
        studentRegistry.register("Mar23", studentMar23Proto);

        Student pratyushApr23 = studentRegistry.get("Apr23").copy();
        pratyushApr23.setName("Pratyush");
        pratyushApr23.setEmail("peatyush@email.com");
        pratyushApr23.setPhoneNumber("1234");

        Student ananthApr23 = studentRegistry.get("Mar23").copy();
        ananthApr23.setName("Ananth");
        ananthApr23.setEmail("ananth@email.com");
        ananthApr23.setPhoneNumber("5678");
    }
}
