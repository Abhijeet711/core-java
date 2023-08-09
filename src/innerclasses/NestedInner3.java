/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package innerclasses;

class Outer3{
    int x=10;
    class Inner3{
        int y=20;
        public void innerDisplay(){
            System.out.println("x="+x+", y="+y);
        }
    }
    
}

public class NestedInner3 {
    public static void main(String[] args) {
        
    //CREATING OBJECT OF NESTED NON STATIC INNER CLASS DIRECTLY INSIDE THE MAIN CLASS: to create an object of inner class, we have to first use reference of outerclass then innerclass and create object of outer class then inner class.                             eg, outerClass.innerClass OI = new ObjOuter().new ObjInner();
        
        Outer3.Inner3 oi3 = new Outer3().new Inner3();
        //this will give the output of inner display
        oi3.innerDisplay();
        //we can only access methods and variables that are present inside the inner class
        System.out.println("y="+oi3.y);
            
        //the statement below will give error, since the object is of inner class and there is no variable 'x' in inner class.
        //System.out.println("x="+oi3.x);
    }
}