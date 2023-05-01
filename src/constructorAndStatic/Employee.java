package constructorAndStatic;

public class Employee {
    String name; //default for string is null
    int salary; //default for int is 0

    //when we dont add any constructor in the class, java adds a default constructor
    //it creates an object with all data members as default values
    /*
        public Employee(){
        }
     */

    //NO-Argument Constructor
    public Employee(){
        name = "Rahul";
        salary = 1000000;
    }
    // In this, we can set valeus for any number of attributes.
    //No-arg constructor, can have some fixed values for the attributes, every object will be created
    //with those values.

    //Parameterised constructor, we can pass values for some/all attributes
    public Employee(String employeeName, int employeeSalary){
        name = employeeName;
        salary = employeeSalary;
    }

    public Employee(String employeeName){
        name = employeeName;
    }


}

//constructor chaining,
//telescoping constructor,
//this and super,
//copy constructor,
//constructor overloading
