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
public class NumberPyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        //rows
        for (int i = 1; i <= rows; i++) {
            //spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            //numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
