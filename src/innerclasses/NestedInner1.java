/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package innerclasses;

class Outer1{
    
    int x=10;
    
    class Inner1{
        int y=20;
        public void innerDisplay(){
            System.out.println(x+" "+y);
        }
    }
    
    public void outerDisplay(){
        //creating object of inner class.
        Inner1 i = new Inner1();
        //this will refer to the method in inner class.
        i.innerDisplay();
        //we can refer the varible y in inner class using object of inner class.
        System.out.println(i.y);
    }
}

public class NestedInner1 {
    public static void main(String[] args) {
        //creating object of super class.
        Outer1 o = new Outer1();
        //this will refer to the method in outer class.
        o.outerDisplay();
    }
}

/*
    The flow goes from:
    1. PSVM
    2. Object of Outer Super class.
    3. Method of Outer Super class.
    4. Object of Inner Nested class.
    5. Method of Inner Nested class.
*/