package constructorAndStatic;

public class Client {
    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println(e.name);
        System.out.println(e.salary);

        e.name = "Deepan";
        e.salary = 200000;

        System.out.println(e.name);
        System.out.println(e.salary);

        //Employee e1 = new Employee("Tejas", 500000); -> syntax
        Employee e1 = new Employee("Tejas",500000);
        System.out.println(e1.name);
        System.out.println(e1.salary);

        Employee e2 = new Employee("Alka");
        System.out.println(e2.name);
        System.out.println(e2.salary);

        //no-args constructor with default values // default constructor
        Department HR  = new Department();
        HR.id = 1;
        HR.name = "HR";
        HR.budget = 500000;
        HR.numberOfEmployees = 5;
        HR.startingYear = 2023;
        HR.companyName = "ABC";
        HR.ceo = "Mr.X";

        //parameterised
        Department finance = new Department(2,"Finance",500000,5,
                2023,"ABC","Mr.X");

        //copy constructor
        //Department marketing = new Department(2,"Marketing",500000,5,2023,"ABC","Mr.X");
        Department marketing = new Department(finance);
        marketing.name = "Marketing";

    }
}
//constructor - no args
//constructor - 2 args

