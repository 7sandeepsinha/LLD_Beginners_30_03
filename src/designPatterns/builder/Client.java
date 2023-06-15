package designPatterns.builder;

public class Client {
    public static void main(String[] args) {
        Student s = Student.builder() //returns the empty builder obj
                            .setId(1) // set id in builder obj and return the same
                            .setName("Ananth") // set name in builder obj and return the same
                            .setGradYear(2021) // set gradYear in builder obj and return the same
                            .setYoe(1) // set YOE in builder obj and return the same
                            .setPsp(80)  // set psp in builder obj and return the same
                            .setBatchName("LLD March23") // set batchName in builder obj and return the same
                            .build(); // validate the builder object and then call the student constructor, and return the student obj

        //Student s = new Student(1,"Ananth",2021,1,80,"LLD March23");

        System.out.println(s);
    }
}
