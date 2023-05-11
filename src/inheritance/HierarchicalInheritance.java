/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritance;

//multiple subclasses extend the same superclass.
class Shape {
    void draw() {
        System.out.println("Shape is being drawn.");
    }
}

class Circle extends Shape {
    void calculateArea() {
        System.out.println("Area of circle is being calculated.");
    }
}

class Square extends Shape {
    void calculateArea() {
        System.out.println("Area of square is being calculated.");
    }
}


public class HierarchicalInheritance {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.draw();
        
        System.out.println("\n--EXAMPLE OVER--\n");
        
        Circle c = new Circle();
        c.draw();
        c.calculateArea();
        
        System.out.println("\n--EXAMPLE OVER--\n");
        
        Square sq = new Square();
        sq.draw();
        sq.calculateArea();
    }
}
