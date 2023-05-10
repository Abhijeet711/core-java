/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pattern;
import java.util.Scanner;
/**
 *
 * @author Abhi
 */
public class InvertedHalfPyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        //in a inverted half pyramid, you have to print the first row with max number of input, and then decrease accordingly. hence, the we take i=numberofrows and then decrement it.
        for(int i=rows; i>=1; i--){
            //here, we print the number of stars according to the number of input.
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //print statement to go from one line to another.
            System.out.println();
        }
    }
}
