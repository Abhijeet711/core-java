/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;

/**
 *
 * @author Abhi
 */
public class NestedTryBlocks {
    //Every statement that we enter a statement in try block, context of that exception is pushed onto the stack.
    //Here the try block within nested try block (inner try block 2) do not handle the exception. The control is then transferred to its parent try block (inner try block 1). If it does not handle the exception, then the control is transferred to the main try block (outer try block) where the appropriate catch block handles the exception.
    public static void main(String args[]) {
        // outer (main) try block  
        try {
            //inner try block 1   
            try {
                // inner try block 2  
                try {
                    int arr[] = {4,7,11,15};

                    //printing the array element out of its bounds  
                    System.out.println(arr[10]);
                } // to handles ArithmeticException  
                catch (ArithmeticException e) {
                    System.out.println("Arithmetic exception");
                    System.out.println(" inner try block 2");
                }
            } // to handle ArithmeticException   
            catch (ArithmeticException e) {
                System.out.println("Arithmetic exception");
                System.out.println("inner try block 1");
            }
        } // to handle ArrayIndexOutOfBoundsException   
        catch (ArrayIndexOutOfBoundsException e4) {
            System.out.print(e4);
            System.out.println(" outer (main) try block");
        } catch (Exception e5) {
            System.out.print("Exception");
            System.out.println(" handled in main try-block");
        }
    }
}
