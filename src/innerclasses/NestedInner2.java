/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package innerclasses;

class Outer2{
    
    int x=10;
    
    class Inner2{
        int y=20;
        public void innerDisplay(){
            System.out.println("x="+x+", y="+y);
        }
    }
    
    //Creating object of inner class outside a method but inside the outer class lets us access it in any method inside the outer class. In the previous example, we can only access it inside the outerDisplayMethod(), but here we can access the object of inner class in any method inside the outer class.
    Inner2 i = new Inner2();
    
    public void outerDisplay(){
        i.innerDisplay();
        System.out.println("y="+i.y);
    }
    
    //example of explanation above:
    public void testDisplay(){
        i.innerDisplay();
        System.out.println("Output from test display.");
    }
    
}

public class NestedInner2 {
    public static void main(String[] args) {
        //creating object of super class.
        Outer2 o = new Outer2();
        o.outerDisplay();
        
        System.out.println("\n--EXAMPLE OVER--\n");
        
        //as you can see in the output, we can refer the object of inner class in any method inside the outer class.
        o.testDisplay();
    }
}