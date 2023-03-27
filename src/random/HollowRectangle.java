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

//in hollow rectangle, only the border elements get printed, the rest rectangle is empty.
public class HollowRectangle {
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();
        //we use this loop for the number of rows.
        for(int i = 1; i<=r; i++){
            //we use this loop for the number of columns.
            for(int j = 1; j<=c; j++){
                //this if statement is used because we only want to print extremes only(borders).
                //so the condition is put as i=1 or j=1 or i=numberofrows or j=numberofcolumns.
                //if any one of the condition is true the star will get printed at that location.
                if(i==1 || j==1 || i==r || j==c){
                    System.out.print("*");
                }//this else statement is written to make the rectangle hollow, or else it wont give the desired output. if the condition of if statement is false, the output will leave a blank overe there.
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }  
}
