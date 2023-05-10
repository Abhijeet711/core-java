/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 * @author Abhi
 */

package oopsbasics;

class Super{
    public void method1(){
        System.out.println("Method 1 of super class.");
    }
    public void method2(){
        System.out.println("Method 2 of super class.");
    }
}

class Sub extends Super{
    @Override
    public void method2(){
        System.out.println("Method 2 of sub class.");
    }
    public void method3(){
        System.out.println("Method 3 of sub class.");
    }
}

//conclusion of dynamic dispatch is, whatever class the object belongs to those methods of that class will be called.
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        //a super class reference can hold the object of subclass, while a sub class reference cannot hold the object of super class.
        Super S = new Sub(); //this will have all the methods of super class and the methods of subclass that are overriden in the subclass.
        S.method1(); //output of super class
        S.method2(); //output of method2 of sub class
        //S.method3(); //error, since there is no method named method3 in super class and we are using the reference of super class, hence this will give error.
        //Sub su = new Super(); //this will give an error, as we are using a sub class object to reference of super class.
    }
}

/*
Visual Representation:
                                   - method1()       --superclass--
    Reference of Super Class S ->  - method2()       --superclass-- here, this method will be shadowed in the super class because we are overriding it in the sub class. hence, the whatever the overridden code is will get executed here.
                                   - method2()       ---subclass---
                                   - method3()       ---subclass---
*/