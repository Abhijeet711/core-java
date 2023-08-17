/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 * @author Abhi
 */

package oopsbasics;

public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();  
    private EagerSingleton() {}  
    public static EagerSingleton getInstance() {  
        return instance;  
    }
     public static void main(String[] args) {  
        EagerSingleton singleton1 = EagerSingleton.getInstance();  
        EagerSingleton singleton2 = EagerSingleton.getInstance();  
        if (singleton1 == singleton2) {  
            System.out.println("Both objects are the same instance.");  
        }  
    } 
}
