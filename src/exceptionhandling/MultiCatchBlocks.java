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
public class MultiCatchBlocks {

    public static void main(String args[]) {
        //in a multi catch block exception, we need to maintain the order of exceptions.
        //ie. exceptions inside the catch block should be ordered from most specific to most general.
        //eg here we have to write, ArithmeticException first then Exception, cuz ArithmeticException comes under Exception.
        try {
            int a[] = new int[5];
            a[5] = 30 / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception");
        } catch (ArithmeticException e) {
            System.out.println("Divide by Zero Exception");
        } catch (Exception e) {
            System.out.println("Common Exception");
        }
    }
}
