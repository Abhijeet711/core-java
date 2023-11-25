/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basics;

/**
 *
 * @author Abhi
 */
public class CallByValue {
    public static void main(String[] args) {
        int x = 5; // Declare and initialize a variable
        modifyValue(x); // Call a method and pass the variable's value
        System.out.println("Original Value of x: "+x); // Output: 5 (unchanged)
        
        System.out.println("\n--EXAMPLE OVER--\n");
        
        StringBuilder builder = new StringBuilder("Hello");
        System.out.println("Original Value of Builder before modifyStringBuilder(): "+builder.toString()); 
        modifyStringBuilder(builder);
        System.out.println("Original Value of Builder after modifyStringBuilder(): "+builder.toString()); 
    }

    public static void modifyValue(int a) {
        a = 10; // Modify the parameter (a), not the original variable (x)
        System.out.println("Modified value which is a copy of x: "+a);
    }

    public static void modifyStringBuilder(StringBuilder str) {
        str.append(", World!"); // Modifies the content of the StringBuilder objects
        System.out.println("Modified value which is a copy of builder: "+str);
    }
    //For primitive data types (e.g., int, float), Java passes a copy of the value, and changes inside the method don't affect the original variable. 
    //For reference data types(objects) , Java passes a copy of the reference (memory address), so you're still working with the same object, and changes inside the method can affect the object's state. However, if you reassign the reference inside the method (str = new StringBuilder("New Value")), it won't affect the original reference.





}
