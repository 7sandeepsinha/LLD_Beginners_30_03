package designPatterns.prototypeRegistry;

public class IntelligentStudent extends Student{
    private int iq;

    public IntelligentStudent(String batchName, double avgBatchPsp, String instructorName, String monthOfEnrollment, String currentModule, String name, String phoneNumber, String email, int iq) {
        super(batchName, avgBatchPsp, instructorName, monthOfEnrollment, currentModule, name, phoneNumber, email);
        this.iq = iq;
    }

    public IntelligentStudent(String batchName, int iq) {
        super(batchName);
        this.iq = iq;
    }


    public IntelligentStudent() {
    }

    public IntelligentStudent copy(){
        IntelligentStudent intelligentStudent = new IntelligentStudent();
        intelligentStudent.setBatchName(this.getBatchName());
        intelligentStudent.iq = this.iq;
        return intelligentStudent;
    }
}
