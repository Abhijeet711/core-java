/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package random;

/**
 *
 * @author Abhi
 */

import java.util.Scanner;
public class BitTriangle01 {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter number of rows: ");
       int rows = sc.nextInt();
       for(int i=1; i<=rows; i++){
           for(int j=1; j<=i; j++){
               if((i+j)%2 == 0){
                   System.out.print(1);
               }
               else{
                   System.out.print(0);
               }
           }
           System.out.println("");
       }
   } 
}
