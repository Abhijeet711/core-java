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

/*
        *
       ***
      *****
     *******
      *****
       ***
        *
*/

public class DiamondPattern {
    public static void main(String[] args) {
/*        
        int n=4;
        //upper half rows
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        //lower half rows, if we want only 1 middle line just use 'int i=n-1'
        for(int i=n-1;i>=1;i--){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
*/
        int rows=5;
        //upper pyramid
        for(int i=0;i<rows;i++){
            //for left side spaces
            for(int j=0;j<rows-i-1;j++){
                System.out.print(" ");
            }
            
            //for stars
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            
            //for right side spaces
            for(int j=0;j<rows-i-1;j++){
                System.out.print(" ");
            }
            
            System.out.println("");
        }
        //lower pyramid
        for(int i=rows-1;i>=0;i--){
            //for left side spaces
            for(int j=0;j<rows-i-1;j++){
                System.out.print(" ");
            }
            
            //for stars
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            
            //for right side spaces
            for(int j=0;j<rows-i-1;j++){
                System.out.print(" ");
            }
            
            System.out.println("");
        }
    }
}
