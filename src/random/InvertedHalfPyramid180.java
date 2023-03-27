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
public class InvertedHalfPyramid180 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        //this is for number of rows.
        for(int i=1;i<=rows;i++){
            
            //this is for printing spaces.
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            
            //this is for printing the stars.
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //this is for going to next line.
            System.out.println();
        }
    }
}
