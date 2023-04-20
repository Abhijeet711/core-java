/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package random;

/**
 *
 * @author Abhi
 */
//rocess in which a method calls itself continuously. method that calls itself is called as recursive method.
public class Recursion {
    static int factorial(int n) {
        if(n==1) {
            return 1;
        }else{
            return (n*factorial(n-1));
        }
    }
/* Working of above code: 
    factorial(5) 
        factorial(4) 
            factorial(3) 
                factorial(2) 
                    factorial(1) 
                        return 1 
                    return 2*1 = 2 
                return 3*2 = 6 
            return 4*6 = 24 
        return 5*24 = 120
*/
    static int n1=0,n2=1,n3=0;      
    static void printFibo(int count){      
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            printFibo(count - 1);
        }
    }
    public static void main(String[] args) {
        System.out.println("Factorial of 5 is: " + factorial(5));
        System.out.println("\n--EXAMPLE OVER--\n");
        int count = 15;
        System.out.print(n1 + " " + n2);//printing 0 and 1      
        printFibo(count - 2);//n-2 because 2 numbers are already printed  
    }

}
