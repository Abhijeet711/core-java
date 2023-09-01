/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author Abhi
 */

package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

class MT extends Thread{
    //whenever we extend the Thread class, we have to override the run() method to use the threads. to use this run() method in our main class, we have to use the .start() method.
    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i + " ");
            try {
                //whenever you run the code, the next value of i will be printed after 2 secondS. the value in this method is written in milliseconds.
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MTExample1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

public class MTExample1{
    public static void main(String[] args) {
        MT mt1 = new MT();
        //as you can see when we make object of our extended class, we use the start() method. if we use the run() to display the output, it will not use threads and directly show us output. run() won't show the output in separate threads. to actaully use a thread we have to use the start() method.
        mt1.start();
        
        //now, we are creating one more object of the same class to demonstrate the use of threads and multithreading.
        //the outputs will be printing simultaneously but you won't understand which thread is printing which output.
        MT mt2 = new MT();
        mt2.start();
    }
}
