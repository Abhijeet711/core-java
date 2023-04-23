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

class Rectangle{
    public int length;
    public int breadth;
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
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

class Cylinder{
    public double height;
    public double radius;
    public double lidArea(){
        return Math.PI*radius*radius;
    }
    public double circumference(){
        return 2*Math.PI*radius;
    }
    public double totalSurfaceArea(){
        return 2*lidArea()+circumference()+height;
    }
    public double volume(){
        return lidArea()*height;
    }
}

class Student{
    public int rollno;
    public String name;
    public String course;
    public int m1,m2,m3;
    public int total(){
        return m1+m2+m3;
    }
    public int average(){
        return (m1+m2+m3)/3;
    }
    public char grade(){
        if(average()>75){
            return 'A';
        }else{
            return 'B';
        }
    }
    public String studDetails(){
        return "Roll No: "+rollno+" Name: "+name+" Course: "+course;
    }
    
    //instead of the above code, we can directly use toString() eg.
    public String toString(){
        return "Roll No: "+rollno+" Name: "+name+" Course: "+course;
    }
}

public class ClassExample {
    public static void main(String[] args) {
        //creating object of circle class. 
        //syntax -> ClassName Object = new ClassName();
        Circle c1  = new Circle();
        c1.radius = 7.81;
        System.out.println("Area of circle1 is: "+c1.area());
        System.out.println("Perimeter of circle1 is: "+c1.perimeter());
        System.out.println("Circumference of circle1 is: "+c1.circumference());
        
        System.out.println("\n--EXAMPLE OVER--\n");        
        
        //different object, so different output.
        Circle c2  = new Circle();
        c2.radius = 1.87;
        System.out.println("Area of circle2 is: "+c2.area());
        System.out.println("Perimeter of circle2 is: "+c2.perimeter());
        System.out.println("Circumference of circle2 is: "+c2.circumference());
        
        System.out.println("\n--EXAMPLE OVER--\n");
        
        Rectangle r1 = new Rectangle();
        r1.length = 4;
        r1.breadth = 11;
        System.out.println("Area of rectangle is: "+r1.area());
        System.out.println("Perimeter of rectangle is: "+r1.perimeter());
        System.out.println("Is out rectangle a square?: "+r1.isSquare());
        
        System.out.println("\n--EXAMPLE OVER--\n");
        
        Cylinder cy1 = new Cylinder();
        cy1.height = 10;
        cy1.radius = 5;
        System.out.println("Lid Area of Cylinder is: "+cy1.lidArea());
        System.out.println("Total Area of Cylinder is: "+cy1.totalSurfaceArea());
        System.out.println("Volume of Cylinder is: "+cy1.volume());
        
        System.out.println("\n--EXAMPLE OVER--\n");
        
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "cartiace";
        s1.course = "CS";
        s1.m1 = 75;
        s1.m2 = 63;
        s1.m3 = 82;
        System.out.println("Details -> "+s1.studDetails());
        System.out.println("Total Marks(out of 300): "+s1.total());
        System.out.println("Average: "+s1.average());
        System.out.println("Grade: "+s1.grade());
        //calling the toString method over here. we only have to use the object because we've used toString()
        System.out.println("Details --> "+s1);
    }
}
