package encapsulation;

public class Client {
    public static void main(String[] args) {
        Student s = new Student(); // created an object of Student class
        s.id = 1;
        s.marks = 100;
        s.name = "Ananth";

        System.out.println(s.id);
        System.out.println(s.marks);
        System.out.println(s.name);
        s.printDetails();


        Rectangle rectangle = new Rectangle();
        rectangle.height = 10;
        rectangle.length = 20;
        Point p = new Point();
        p.x = 5;
        p.y = 3;
        rectangle.bottomLeft = p;

        rectangle.area();
        rectangle.perimeter();
        rectangle.topRightCoordinate();
    }
}

/*
public -> access anywhere
private -> access no where only inside the class
default -> access anywhere inside package, and no where outside package irrespective of child class or not
 */
