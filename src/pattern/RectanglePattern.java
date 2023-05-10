/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pattern;
import java.util.*;
/**
 *
 * @author Abhi
 */
public class RectanglePattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();
        //nested for loops.
        //whenever there is a pattern problems, always remember the outer loop will be of rows and inner loop will be of columns.
        //this loop is for number of rows.
        for(int i = 1; i<=r; i++){
            //this is inner nested loop for number of columns.
            for(int j = 1; j<=c; j++){
                //printing the first row and all columns.
                System.out.print("*");
            }
            //once the first row is done, we have to go to 2nd row and print all columns again, hence we use this print.
            System.out.println();
        }
    }
}
