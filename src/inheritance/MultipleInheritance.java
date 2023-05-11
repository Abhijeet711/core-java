/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritance;

//a subclass implements multiple interfaces.
interface Drawable {
    void draw();
}

interface Moveable {
    void move();
}

class Circlee implements Drawable, Moveable {
    
    void resize() {
        System.out.println("Circle is being resized.");
    }
    
    @Override
    public void draw() {
        System.out.println("Circle is being drawn.");
    }
    
    @Override
    public void move() {
        System.out.println("Circle is being moved.");
    }
}


public class MultipleInheritance {
    public static void main(String[] args) {
        Circlee c = new Circlee();
        c.draw();
        c.move();
        c.resize();
    }
}
