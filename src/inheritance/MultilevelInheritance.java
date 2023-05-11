/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author Abhi
 */

package inheritance;

//a subclass extends another subclass, which in turn extends a superclass.
class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

class Poodle extends Dog {
    void groom() {
        System.out.println("Poodle is being groomed.");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        
        System.out.println("\n--EXAMPLE OVER--\n");
        
        Dog d = new Dog();
        d.eat();
        d.bark();
        
        System.out.println("\n--EXAMPLE OVER--\n");
        
        Poodle p = new Poodle();
        p.eat();
        p.bark();
        p.groom();
    }
}
