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
//multiple methods having same name but different in parameters.
//two possible ways -> 1. By changing number of arguments, 2. By changing the data type
public class MethodOverloading {
    //area of a rectangle
    public static double area(double length, double breadth){
        double area = length*breadth;
        return area;
    }
    //area of a circle
    public static double area(double radius){
        double area = Math.PI*radius*radius;
        return area;
    }
    //area of a trapezium
    public static double area(double side1, double side2, double height){
        double area = ((side1+side2)*height)/2;
        return area;
    }
    public static void main(String[] args) {
        System.out.println("Area of a rectangle with length 7 and breadth 11 is: "+area(7,11));
        System.out.println("\n--EXAMPLE OVER--\n");
        System.out.println("Area of a circle with radius 10 is: "+area(10));
        System.out.println("\n--EXAMPLE OVER--\n");
        System.out.println("Area of trapezium is: "+area(8,3,5));
    }
}
