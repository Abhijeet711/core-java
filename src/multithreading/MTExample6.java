/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author Abhi
 */

package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MTExample6 {
    public static void main(String[] args) {
        int thread=2;
        for(int i=1;i<=thread;i++){
            OutputMT omt = new OutputMT(i);
            omt.start();
            //the isAlive() method returns a boolean value if the current thread is alive or not.
            System.out.println(omt.isAlive());
            try {
            //the join() method waits for the one thread to complete its execution and then start the next thread.
            //though, in out example, it defeats the purpose of multithreading.
                omt.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(MTExample6.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(omt.isAlive());
            //from the output, you will notice that, at the end of the first thread it will show false, that is the output of current thread number 1 and since it is completed, it shows output false.
            //and the next true output is of our thread number 2.
        }
    }
}
