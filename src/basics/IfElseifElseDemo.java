/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basics;
import java.util.*;
/**
 *
 * @author Abhi
 */
public class IfElseifElseDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        if(num1==num2){
            System.out.println("num1 is equal to num2.");
        }
        else if(num1>num2){
            System.out.println("num1 is greater.");
        }
        else{
            System.out.println("num2 is greater."); 
        }
    }
}
