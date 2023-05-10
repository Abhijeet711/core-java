/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basics;

import java.util.Scanner;

/**
 *
 * @author Abhi
 */
public class SwitchDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Press a button: ");
        int button = sc.nextInt();
        switch(button){
            case 1:
                System.out.println("Hello.");
                break;
            case 2:
                System.out.println("Namaste.");
                break;
            case 3:
                System.out.println("Bonjour.");
                break;
            default:
                System.out.println("Press valid button.");
                break;
        }
    }
}
