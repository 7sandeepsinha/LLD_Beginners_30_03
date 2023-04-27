package encapsulation;

public class Rectangle {
    int height;
    int length;
    Point bottomLeft; //reference variable

    void area(){
        System.out.println(length * height);
    }

    void perimeter(){
        System.out.println(2 * (length + height));
    }

    void topRightCoordinate(){
        System.out.println("X " + (bottomLeft.x + length));
        System.out.println("Y " + (bottomLeft.y + height));
    }

}
