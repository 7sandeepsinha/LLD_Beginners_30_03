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
    }
}
//constructor - no args
//constructor - 2 args

