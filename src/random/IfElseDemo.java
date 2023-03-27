/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package random;

import java.util.Scanner;

/**
 *
 * @author Abhi
 */
public class IfElseDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if(age>18){
            System.out.println("You are an adult.");
        }
        else{
            System.out.println("You are a child."); 
        }
    }
}
