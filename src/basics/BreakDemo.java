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
public class BreakDemo {
    public static void main(String[] args) {
        //assigning n as integer value
        int n = 3;
        //passing n to switch
        // it will check n and display output accordingly
        switch (n) {
            case 1:
                System.out.println("First Case");
                break;
            case 2:
                System.out.println("Second Case");
                break;
            case 3:
                System.out.println("Third Case");
            default:
                System.out.println("Default case");
        }
        
        System.out.println("\n--EXAMPLE OVER--\n");
        
        int n1 = 1;
        //as you can see in the output, the default case won't get printed here, as the switch case 1 breaks after its execution.
        switch (n1) {
            case 1:
                System.out.println("First Case");
                break;
            case 2:
                System.out.println("Second Case");
                break;
            case 3:
                System.out.println("Third Case");
            default:
                System.out.println("Default case");
        }
        
        System.out.println("\n--EXAMPLE OVER--\n");
        
        for (int i = 0; i < 10; i++) {
            // the terminate loop when i is 5 due to the use of break statement.
            if (i == 5)
                break;
 
            System.out.println("i: " + i);
        }
        System.out.println("Loop complete.");
    }
}
