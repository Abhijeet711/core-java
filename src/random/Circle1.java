/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 * @author Abhi
 */
package random;

//you cannot make this class public, it will give error.
//in java we have to make public class as the filename.
class Circle{
    public double radius;
    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double circumference(){
        //in a circle, circumference and perimeter is same. hence, calling perimeter method.
        return perimeter();
    }
}

public class Circle1 {
    public static void main(String[] args) {
        //creating object of circle class. 
        //syntax -> ClassName Object = new ClassName();
        Circle c1  = new Circle();
        c1.radius = 7.81;
        System.out.println("Area is: "+c1.area());
        System.out.println("Perimeter is: "+c1.perimeter());
        System.out.println("Circumference is: "+c1.circumference());
        System.out.println("\n--EXAMPLE OVER--\n");        
        Circle c2  = new Circle();
        c2.radius = 1.87;
        System.out.println("Area is: "+c2.area());
        System.out.println("Perimeter is: "+c2.perimeter());
        System.out.println("Circumference is: "+c2.circumference());
    }
}
