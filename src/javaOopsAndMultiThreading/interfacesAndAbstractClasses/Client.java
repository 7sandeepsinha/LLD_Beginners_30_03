package javaOopsAndMultiThreading.interfacesAndAbstractClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Bird> birds = new ArrayList<>();
        birds.add(new Crow());
        birds.add(new Sparrow());
        birds.add(new Penguin());

        for(Bird b : birds){
            b.breathe();
        }

        List<IFlyable> flyableBirds = new ArrayList<>();
        flyableBirds.add(new Crow());
        flyableBirds.add(new Sparrow());

        for(IFlyable b : flyableBirds){
            b.fly();
        }

        List<Car> cars = new ArrayList<>();
        cars.add(new Car(100, 100000));
        cars.add(new Car(200, 120000));
        cars.add(new Car(50, 20000));
        cars.add(new Car(250, 200000));
        cars.add(new Car(125, 75000));
        System.out.println("Unsorted cars");
        System.out.println(cars);

        Collections.sort(cars);
        System.out.println("Sorted cars");
        System.out.println(cars);

        PersonalVehicle pv = new PersonalVehicle();
        ICar pvCar = new PersonalVehicle();
        IBike pvBike = new PersonalVehicle();

        pv.run();
        pvCar.run();
        pvBike.run();

        //Bird b = new Bird();
        //b.eat();
    }
}
