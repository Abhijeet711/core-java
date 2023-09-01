/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author Abhi
 */
package collectionframework;

//we can have generic methods in a non-generic class.
public class GenericMethodExample1 {

    //return type of this method is void.
    //<T> is the method declaration used to specify the input type of the method.
    public static <T> void shout1(T shoutOut){
        System.out.println(shoutOut+" you!");
    }
    
    //can have multiple generics as well, just have to use comma.
    public static <T,U> void shout2(T shoutOut, U youToo){
        System.out.println(shoutOut+" you!");
        System.out.println(youToo+" you too!!");
    }
    public static void main(String[] args) {
        //using method with only one input type.
        shout1("hitman");
        
        System.out.println("\n--EXAMPLE OVER--\n");
        
        //same datatype of both the generics.
        shout2("ez","pz");
        
        System.out.println("\n--EXAMPLE OVER--\n");
        
        //different datatypes of the generics.
        shout2("agent",47);
    }
    
}
