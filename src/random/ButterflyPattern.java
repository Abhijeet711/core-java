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
public class ButterflyPattern {
    public static void main(String[] args) {
        int n = 4;
        //for upper rows
        for(int i=1; i<=n; i++){
            //for upper left part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //for spaces between upper parts
            int spaces = 2*(n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            //for upper right part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        //for lower rows
        for(int i=n; i>=1; i--){
            //for lower left part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //for spaces between lower^ parts
            int spaces = 2*(n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            //for lower right part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
