/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author Abhi
 */

package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;


//if any one of the threads blow up during the execution, it doesnt affect any other threads. the other threads will keep running as usual. to demonstrate this, example:
class ErrorMT extends Thread{
    
    //we are creating this threadNumber integer to keep track of the thread we are using, you will see in output.
    private int threadNumber;
    public ErrorMT(int threadNumber){
        this.threadNumber = threadNumber;
    }
    
    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i + " from thread " + threadNumber);
            //the following if loop will make the thread number 2 blow, but rest of the threads will run properly.
            if(threadNumber==3){
                throw new RuntimeException();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MTExample1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
public class MTExample5 {
    public static void main(String[] args) {
        int thread = 5;
        for(int i=1;i<=thread;i++){
            ErrorMT emt = new ErrorMT(i);
            emt.start();
        }
        //as you can see from the output, all the other threads will display our count from 1 to 5 properly but thread number 3 won't show any output.
    }
}
