/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 ffx    * @author Abhi
 */

package innerclasses;

//here we are using an abstract class, but we can have the same functionality using interface as well.
abstract class test{
    abstract public void testshow();
}

class LocalOuter2{
    public void display(){
        //creating an anonymous class and anonymous object of the same class. test() is anonymous class as well as anonymous object.
        new test(){
          @Override
          public void testshow(){
              System.out.println("Output of display() inside anonymous class.");
          }  
        }.testshow();
    }   
}

public class LocalInner2 {
    public static void main(String[] args) {
        LocalOuter2 LO2 = new LocalOuter2();
        LO2.display();
    }
}
