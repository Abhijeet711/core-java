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
[space,stars,space] assuming n=5, total 9 stars to be printed.
for spaces -> n-i-1  
for stars  -> 2*i+1

        *           [4,1,4]
       ***          [3,3,3]
      *****         [2,5,2]
     *******        [1,7,1]
    *********       [0,9,0]
*/

public class Pyramid {
    public static void main(String[] args) {
        int rows=5;
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
    }
}
