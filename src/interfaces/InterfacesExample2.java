/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 * @author Abhi
 */

package interfaces;

class phone{
    public void call(){
        System.out.println("Calling.");
    }
    public void sms(){
        System.out.println("Sending SMS.");
    }
}

interface camera{
    void photo();
    void record();
}

interface musicplayer{
    void play();
    void stop();
}

class SmartPhone extends phone implements camera, musicplayer{
    //overridden methods of camera interface.
    @Override
    public void photo() {
        System.out.println("Smartphone is clicking a photo.");
    }
    @Override
    public void record() {
        System.out.println("Smartphone is recording a video.");
    }
    
//overridden methods of musicplayer interface.
    @Override
    public void play() {
        System.out.println("Smartphone started playing music.");
    }
    @Override
    public void stop() {
        System.out.println("Smartphone stopped playing music.");
    }
    
    //concrete method of SmartPhone class.
    public void videocall(){
        System.out.println("Smartphone in use for videocall.");
    }
}

public class InterfacesExample2 {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone(); //using both reference and object of child class.
        
        //methods of parent class phone.
        sp.call();
        sp.sms();
        
        //methods of interface camera which are overridden in child class.
        sp.photo();
        sp.record();
        
        //methods of interface musicplayer which are overridden in child class.
        sp.play();
        sp.stop();
        
        //concrete method of child class.
        sp.videocall();
        
        System.out.println("\n--EXAMPLE OVER--\n");
        
        //if we use the reference of parent class and object of child class, methods present only in parent class can be used. eg,
        phone p = new SmartPhone();
        p.call();
        p.sms();
        
        System.out.println("\n--EXAMPLE OVER--\n");
        
        //if we use the reference of interface camera and object of child class, methods present only in camera interface can be used. eg,
        camera csp = new SmartPhone();
        csp.photo();
        csp.record();
        //csp.sms();        this will give error because there is no method named sms() in camera interface.
        //csp.play();       this will give error because there is no method named play() in camera interface.
    }
}
