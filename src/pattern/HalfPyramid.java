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
//in half pyramid, the number of rows decide the number of output stars(*). eg if the user inputs 3 rows, the first row will have 1 star, second row will have 2 stars and third row will have 3 stars.
//now, we need 2 for loops, one for the number of rows and another for the number of stars getting printed.
public class HalfPyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        //this for loop is for number of rows.
        for(int i=1; i<=rows; i++){
            //this for loop is for number of outputs getting printed.(check comment on line 13)
            //it will only print the number of stars w.r.t. row number. the upper limit is set to number of rows, ie. j cannot be greater than i. hence, j<=i.
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
