/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *  @author Abhi   
 */

package inheritance;

//a subclass extends a single superclass
class Vehicle {
    void start() {
        System.out.println("Vehicle started.");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is being driven.");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.start();
        
        System.out.println("\n--EXAMPLE OVER--\n");
        
        Car c = new Car();
        c.start();
        c.drive();
    }
}
