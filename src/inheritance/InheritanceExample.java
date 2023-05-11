/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 * @author Abhi
 */

package inheritance;

//1) The process by which one class acquires the properties (data members) and functionalities (methods) of another class is called inheritance.
//2) The aim of inheritance is to provide the re-usability of code so that a class has to write only the unique features and rest of the common properties and functionalities can be extended from the another class.
//3) The class that extends the features of another class is known as child class, sub class or derived class.
//4) The class whose properties and functionalities are used (inherited) by another class is known as parent class, super class or Base class. 
//Types of Inheritance:
//1) Single Inheritance: Class B extends Class A.
//2) Multilevel Inheritance: Class C extends Class B. Class B extends Class A.
//3) Hierarchical Inheritance: Class B, Class C and Class D extends Class A.
//4) Multiple Inheritance: Class C extends Class A and Class B. Multiple Class extension is not supported in Java. It can be achieved using Interfaces.

//superclass - rectt
class rectt{
    //for demonstration of constructor calling in inheritance.
    public rectt(){
        System.out.println("Rectangle Constructor");
    }
    public float length;
    public float breadth;
    public float area(){
        return length*breadth;
    }
    public float perimeter(){
        return 2*(length+breadth);
    }
    public boolean isSquare(){
        if(length==breadth){
            return true;
        }else{
            return false;
        }
    }
}

//child class - cuboid
class cuboid extends rectt{
    public cuboid(){
        System.out.println("Cuboid Constructor");
    }
    public float height;
    public float volume(){
        return area()*height;
    }
    public float surfaceArea(){
        return 2*(length*breadth+breadth*height+height*length);
    }
    public boolean isCube(){
        if(length==breadth && breadth==height && length==height){
            return true;
        }else{
            return false;
        }
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        rectt r = new rectt();
        r.length=5;
        r.breadth=4;
        System.out.println("Area is: "+r.area());
        System.out.println("Perimeter is: "+r.perimeter());
        System.out.println("Is the rectt a square?: "+r.isSquare());
        
        System.out.println("\n--EXAMPLE OVER--\n");
        
        //here, as the object of cuboid is gretting created, you'll see in the output that the rectt constructor getting called first and then the cuboid constructor. this is called constructor chaining. the compiler will always call parent class constructor and then child class constructor.
        cuboid c = new cuboid();
        c.length=5;
        c.breadth=4;
        c.height=3;
        System.out.println("Volume of cuboid is: "+c.volume());
        System.out.println("Surface Area of cuboid is: "+c.surfaceArea());
        System.out.println("Is the cuboid a cube?: "+c.isCube());
    }
}
