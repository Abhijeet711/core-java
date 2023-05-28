/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pattern;
/**
 *
 * @author Abhi
 */
import java.util.Scanner;
public class NumberHalfPyramidwSameRows {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        //rows
        for(int i=1; i<=rows; i++){
            //numbers
            for(int j=1; j<=i; j++){
                //i is the number of current row, so it prints i i times.
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
}
