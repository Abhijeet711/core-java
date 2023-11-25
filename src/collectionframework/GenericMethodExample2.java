/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author Abhi
 */
package collectionframework;

public class GenericMethodExample2 {

    public static <U> U action(U input) {
        // Perform some action (e.g., doubling the input value)
        if (input instanceof Integer) {
            return (U) Integer.valueOf(((Integer) input) * 2);
        } else if (input instanceof Double) {
            return (U) Double.valueOf(((Double) input) * 2.0);
        }
        //we are putting 'else{return input;}' if non of the datatype matches the input datatype in our method.
        else{
            return input;
        }
    }

    public static void main(String[] args) {
        //as you can see in the method above, our method is in a non-generic class but it is a generic method.
        //<U>           -> the method declaration is used to specify the data type of both input and return. 
        //U input       -> this is the input parameter of action(), its datatype is also U.
        //U return type -> this is the return type of action(), it is also U.
        Integer intResult = action(5);
        System.out.println("Result (Integer): " + intResult);
        
        System.out.println("\n--EXAMPLE OVER--\n");

        Double doubleResult = action(3.14);
        System.out.println("Result (Double): " + doubleResult);
        
        System.out.println("\n--EXAMPLE OVER--\n");
        
        //this is getting returned by the else statement. if input type of output is not Integer and Double then it will return as it is.
        String strResult = action("cartiace");
        System.out.println("Result (String): " + strResult);
    }
}
