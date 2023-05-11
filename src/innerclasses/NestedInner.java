/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package innerclasses;

class Outer{
    
    int x=10;
    
    class Inner{
        int y=20;
        public void innerDisplay(){
            System.out.println(x+" "+y);
        }
    }
    
    public void outerDisplay(){
        Inner i = new Inner();
        i.innerDisplay();
        System.out.println(i.y);
    }
}

public class NestedInner {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.outerDisplay();
    }
}
