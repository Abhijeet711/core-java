/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package random;

/**
 *
 * @author Abhi
 */
import java.util.*;

public class Car {
    private String name;
    private Long chassi;

    public Car(String name, Long chassi) {
        this.name = name;
        this.chassi = chassi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public Long getChassi() {
        return this.chassi;
    }

    public static void main(String[] args) {
        Set<Car> allMyCars = new HashSet<>();

        Car myFirstCar = new Car("Elvis", null);
        allMyCars.add(myFirstCar);

        Car mySecondCar = new Car("Elvis", 23L);
        allMyCars.add(mySecondCar);

        Car myCurrentCar = allMyCars.stream().filter(car -> mySecondCar.equals(car)).findFirst().get();

        System.out.println("My current car's chassi number is: " + myCurrentCar.getChassi());
    }
}

