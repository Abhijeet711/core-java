/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author Abhi
 */

package random;

class GarbageEx{
    void test(){
        System.out.println("Test method called!");
    }
    //as you can see, we have @Override annotation over finalize() method.
    //finalize method is automatically called when we call the System.gc() method.
    @Override
    public void finalize(){
        System.out.println("Finalize method called!");
    }
}

public class GarbageCollection {
    public static void main(String[] args) {
        GarbageEx ge = new GarbageEx();
        ge.test(); //calling method in GarbageEx class.
        ge = null;
        System.gc();
    }
}
