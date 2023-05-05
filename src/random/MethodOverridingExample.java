/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author Abhi
 */

package random;

class TV{
    public void VolumeUp(){
        System.out.println("Generic TV volume is increased.");
    }
    public void VolumeDown(){
        System.out.println("Generic TV volume is decreased.");
    }
}

class SmartTV extends TV{
    //overriden the methods of TV class to use in SmartTV class.
    @Override
    public void VolumeUp(){
        System.out.println("Smart TV volume is increased.");
    }
    @Override
    public void VolumeDown(){
        System.out.println("Smart TV volume is decreased.");
    }
    //new method of SmartTV class, can only be accessed by the object of SmartTV.
    public void Youtube(){
        System.out.println("Smart TV browsing youtube.");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.VolumeUp();
        SmartTV t = new SmartTV();
        t.Youtube();
        t.VolumeDown();
    }
}
