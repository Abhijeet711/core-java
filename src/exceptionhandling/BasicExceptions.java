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
public class BasicExceptions {
    public static void main(String args[]) {
        try {
            int data = 100 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception is: " + e);
        }
        
        System.out.println("\n--EXAMPLE OVER--\n");
        
        try {
            String s = null;
            System.out.println(s.length());//
        } catch (NullPointerException e) {
            System.out.println("Exception is: " + e);
        }
        
        System.out.println("\n--EXAMPLE OVER--\n");
        
        try {
            String s = "abc";
            int i = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("Exception is: " + e);
        }
        
        System.out.println("\n--EXAMPLE OVER--\n");
        
        try {
            int a[] = new int[5];
            a[10] = 50;
        } catch (ArrayIndexOutOfBoundsException e) {
            //we can print anything over here, we are printing the exception to understand what type of exception it is.
            System.out.println("Exception is: " + e);
        } finally{
            System.out.println("Finally block will always get executed.");
        }
    }
}
