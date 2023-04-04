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
public class PalindromicNumberPyramid {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number of rows: ");
//        int rows = sc.nextInt();
        int rows = 5;
        //rows
        for(int i=1; i<=rows; i++){
            //spaces
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            //left side numbers 
            for(int j=i; j>=1;j--){
                System.out.print(j);
            }
            //right side numbers, to print the number 1 twice, just replace int j=1
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
