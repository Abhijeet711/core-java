/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 * @author Abhi
 */

package random;

/*
    Interfaces:
    - interfaces are completely used to achieve abstraction and polymorphism, it doesnt has anything for subclass.
    - all methods of an interface are abstract, so you cannot make object of an interface. (cannot be instantiated ie. represented)
    - uses implements keyword for inheritance.
    - an interface is a collection of method signatures that defines a contract between two parts of a program. 
    - it defines a set of methods that a class must implement if it implements that interface. 
    - interfaces can be extended using another interface.
    - interfaces can have static as well as default methods.
    - interfaces can have constants.
    - a reference of an interface can hold the object of a class which is implementing that interface.
*/

interface Animal{
    void eat();
    void sleep();
}

//overriding all methods of Animal interface.
class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }
    @Override
    public void sleep() {
        System.out.println("Dog is sleeping.");
    }
}

//can extend an interface using another interface.
interface Animal1 extends Animal{
    void run();
    void play();
}

//overriding all methods of Animal1 interface.
class Cat implements Animal1 {
    @Override
    public void eat() {
        System.out.println("Cat is eating.");
    }
    @Override
    public void sleep() {
        System.out.println("Cat is sleeping.");
    }
    @Override
    public void run() {
        System.out.println("Cat is running.");
    }
    @Override
    public void play() {
        System.out.println("Cat is playing.");
    }
}

public class InterfacesExample1 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat();
        dog.sleep();
        
        System.out.println("\n--EXAMPLE OVER--\n");
        
        Animal1 cat = new Cat(); //using reference of extended interface Animal1. we can also use reference of interface Animal but then we can only use the methods in that interface.
        cat.eat();
        cat.sleep();
        cat.run();
        cat.play();
    }
}
