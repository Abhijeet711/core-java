/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 ffx    * @author Abhi
 */

package innerclasses;

class LocalOuter1{
    public void display(){
        class LocalInner1{
            public void show(){
                System.out.println("Output of display() inside LocalInner class.");
            }
        }
        //instead of using the reference and creating object of inner class, we directly create an anonymous object of inner class and using '.' operator call the method inside the inner class.
        new LocalInner1().show();
    }   
}

public class LocalInner1 {
    public static void main(String[] args) {
        LocalOuter1 LO1 = new LocalOuter1();
        LO1.display();
    }
}
