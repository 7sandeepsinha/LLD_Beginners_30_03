package designPatterns.builder;

import designPatterns.builder.exception.InvalidGradYearException;
import designPatterns.builder.exception.InvalidNameException;
import designPatterns.builder.exception.InvalidYOEException;

public class Student {
    private int id;
    private String name;
    private int yoe;
    private int gradYear;
    private double psp;
    private String batchName;

    private Student(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.yoe = builder.yoe;
        this.gradYear = builder.gradYear;
        this.psp = builder.psp;
        this.batchName = builder.batchName;
    }

    public static Builder builder(){
        Builder b = new Builder();
        return b;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", yoe=" + yoe +
                ", gradYear=" + gradYear +
                ", psp=" + psp +
                ", batchName='" + batchName + '\'' +
                '}';
    }

    static class Builder {
        public int id;
        public String name; // validate -> name is not null
        public int yoe; // validate -> yoe >= 1
        public int gradYear; // validate -> gradYear >=2022
        public double psp;
        public String batchName;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setYoe(int yoe) {
            this.yoe = yoe;
            return this;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Builder setBatchName(String batchName) {
            this.batchName = batchName;
            return this;
        }

        public void validate(){
            if(name == null){
                throw new InvalidNameException("Name should not be null");
            }
            if(yoe < 1){
                throw new InvalidYOEException("YOE should not be 0");
            }
            if(gradYear > 2022){
                throw new InvalidGradYearException("Grad year should be 2022 or before");
            }
        }

        public Student build(){
            this.validate();
            Student s = new Student(this);
            return s;
        }
    }
}
