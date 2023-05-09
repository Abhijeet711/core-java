/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package random;


/*
    Abstract Class:
    - abstract keyword is a non access modifier used for classes and methods.
    - abstract method doesn't have a body, its body is provided by the subclass.
    - cannot create object of abstract class, but can have a reference of it.
    - if you want a method to be empty, you have to define it as abstract and the class containing the abstract method should be declared as abstract class.
    - you cannot create a class with final and abstract keywords, it will generate a conflict.
    - you cannot create a class with static and abstract keywords.
    - abstract method cannot be final or static.
*/

abstract class shape{
    abstract public double perimeter();
    abstract public double area();
}

class circle extends shape{
    double radius;
    @Override
    public double perimeter(){
        return 2*3.141592*radius;
    }
    @Override
    public double area(){
        return 3.141592*radius*radius;
    }
}

class rect extends shape{
    double length;
    double breadth;
    @Override
    public double perimeter(){
        return 2*(length+breadth);
    }
    @Override
    public double area(){
        return length*breadth;
    }
}

public class AbstractExample2 {
    public static void main(String[] args) {
        circle c = new circle();
        c.radius = 20.82932d;
        System.out.println("Area of circle is: "+c.area());
        System.out.println("Perimeter of circle is: "+c.perimeter());
        
        System.out.println("\n--EXAMPLE OVER--\n");
        
        rect r = new rect();
        r.length = 5d;
        r.breadth = 4d;
        System.out.println("Area of rectangle is: "+r.area());
        System.out.println("Perimeter of rectangle is: "+r.perimeter());
    }
}
