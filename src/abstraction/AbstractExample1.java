package abstraction;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author Abhi
 */

abstract class Hospital{
    abstract void emergency();
    abstract void appointment();
    abstract void admit();
    abstract void bill();
}

class MyHospital extends Hospital{

    @Override
    void emergency() {
        System.out.println("There is an emergency.");
    }

    @Override
    void appointment() {
        System.out.println("Appointment is made.");
    }

    @Override
    void admit() {
        System.out.println("Patient is admitted.");
    }

    @Override
    void bill() {
        System.out.println("Bill is generated.");
    }
    
}

public class AbstractExample1 {
    public static void main(String[] args) {
        //Hospital H = new Hospital();      //we cannot have an object of abstract class.
        
        MyHospital MH = new MyHospital();
        MH.emergency();
        MH.appointment();
        MH.admit();
        MH.bill();
        
        System.out.println("\n--EXAMPLE OVER--\n");
        
        Hospital H = new MyHospital();      //we can have a reference of parent abstract class and the object of child class which has overridden methods.
        H.admit();
        H.bill();
    }
}
