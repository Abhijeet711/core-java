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
public class Rhombus {
    public static void main(String[] args) {
        int n=5;
        //for rows
        for(int i=1; i<=n; i++){
            //for spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //for stars
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
