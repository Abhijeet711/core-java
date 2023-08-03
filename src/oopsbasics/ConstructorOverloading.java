/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oopsbasics;

/**
 *
 * @author Abhi
 */
//A constructor is just like a method but without return type. It can also be overloaded like Java methods.
//Constructor overloading in Java is a technique of having more than one constructor with different parameter lists. They are arranged in a way that each constructor performs a different task. They are differentiated by the compiler by the number of parameters in the list and their types.
public class ConstructorOverloading {
    int id;  
    String name;  
    int age;  

    //creating two arg constructor  
    ConstructorOverloading(int i,String n){  
    id = i;  
    name = n;  
    }  
    //creating three arg constructor  
    ConstructorOverloading(int i,String n,int a){  
    id = i;  
    name = n;  
    age=a;  
    }  
    void display(){System.out.println(id+" "+name+" "+age);}  
   
    public static void main(String args[]){  
    ConstructorOverloading student1 = new ConstructorOverloading(111,"Abhi"); //can use two args or three agrs constructor 
    ConstructorOverloading student2 = new ConstructorOverloading(222,"carti",25);  //can only use three args constructor
    student1.display();  
    student2.display();  
   }  
}
