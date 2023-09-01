/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author Abhi
 */

package multithreading;


public class MTExample2{
    public static void main(String[] args) {
        //we are using the class from MTExample1.java file.
        MT mt1 = new MT();
        MT mt2 = new MT();
        //you will see an annotation over here about replacing the run() method with start() method, but we are doing this for demonstrating what will happen if we use run() method.
        mt1.run();
        System.out.println("\n--Above are from mt1 object, below are from mt2 object--\n");
        mt2.run();
        // if we use the run() method of both the objects, first it will print output of first object and then it will print output of second object.
        //as you can see from the output, we are not getting the count 1 to 5 simultaneously.
    }
}
