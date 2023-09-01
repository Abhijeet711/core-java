/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author Abhi
 */

package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

class OutputMT extends Thread{
    
    //we are creating this threadNumber integer to keep track of the thread we are using, you will see in output.
    private int threadNumber;
    public OutputMT(int threadNumber){
        this.threadNumber = threadNumber;
    }
    
    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i + " from thread " + threadNumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MTExample1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}


public class MTExample4 {
    public static void main(String[] args) {
        //here, we have 3 threads for running the code.
        int thread = 3;
        for(int i=1;i<=thread;i++){
            //we are passing i as parameter for our constructor because we are going thru a for loop. hence the number of iteration will keep track of our thread number.
            OutputMT omt = new OutputMT(i);
            omt.start();
            //as you can see from the output the threads doesnt always print in a linear way, any thread can print the output anytime. all the threads are running at the same time completely independently, therefore there will be slight variance in the timing.
        }
    }
}
