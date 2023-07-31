package javaOopsAndMultiThreading.inheritanceAndPolymorphism;

public class Product {
    int id;
    String name;
    int quantity;
    int price;

    public Product(int id, String name, int quantity, int price) {
        this(id,name,quantity);
        this.price = price;
    }

    public Product(int id, String name, int quantity) {
        this(id,name);
        this.quantity = quantity;
    }

    public Product(int id, String name) {
        this(id);
        this.name = name;
    }

    public Product(int id) {
        this.id = id;
    }

    public void main(){
        System.out.println("Not the same as main method of psvm");
    }
}
