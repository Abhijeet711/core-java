/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author Abhi
 */

package inheritance;

/*
you can override methods from a superclass in a subclass, but there are some rules and restrictions regarding access modifiers:

public methods can be overridden by public methods in a subclass.

protected methods can be overridden by protected methods in a subclass.

default (package-private) methods can be overridden by default methods in a subclass, but only if the subclass is in the same package as the superclass.

private methods cannot be overridden because they are not accessible outside the class in which they are defined.

*/

class Superclass{
    public void publicMethod() {
        System.out.println("Public method in superclass");
    }

    protected void protectedMethod() {
        System.out.println("Protected method in superclass");
    }

    void defaultMethod() {
        System.out.println("Default method in superclass");
    }

    private void privateMethod() {
        System.out.println("Private method in superclass");
    }
}

class Subclass extends Superclass {
    @Override
    public void publicMethod() {
        System.out.println("Public method in subclass");
    }

    @Override
    protected void protectedMethod() {
        System.out.println("Protected method in subclass");
    }
    
     // Cannot override defaultMethod with a more restrictive modifier, but can directly override using returntype and method name.
    // @Override
    // private void defaultMethod() { ... }
    
    @Override 
    void defaultMethod(){
        System.out.println("Default method in subclass");
    }
    
    // Cannot override privateMethod because it's not accessible here.
}

public class InheritanceExample2 {
    //The order of access modifiers and non-access modifier does not affect the functionality of the method.
    static public void main(String[] args) {
    }
}


