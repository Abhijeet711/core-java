/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author Abhi
 */

package interfaces;

/*
    - in an interface, by default the methods are public and abstract.
    - we cannot make a method as private in an interface.
    - we can identifires (variable) in an interface, they should always be uppercase. these identifires are static and final that means they are CONSTANTS.
    - we cannot have a concrete method in an interface. 
    - we can have a static method with body in an interface. we can access this method using interfaceName.methodName();
    - to access constants or static methods, we have to use '.' operator. eg. interface1.X; or interface1.method1();
    - a interface can extend from another interface. it can have its own methods. 
    - from JAVA8, we can have default methods in an interface. it is not mandatory to override default methods.
*/

interface test{
    final static int X = 7;
    
    public static void meth1(){
        System.out.println("Output of method1 of test interface.");
    }   
}

public class InterfacesExample4 {
    public static void main(String[] args) {
        System.out.println(test.X);     //accessing constant of interface.
        test.meth1();       //accessing static method of interface.
    }
   
}
