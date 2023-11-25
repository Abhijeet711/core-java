/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ripplehire;

/**
 *
 * @author Abhi
 */
public class Loops {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n\n--EXAMPLE OVER--\n");
        for(int x:arr){
            System.out.print(x + " ");
        }
        System.out.println("\n\n--EXAMPLE OVER--\n");
        int w = 5;
        while(w>1){
            System.out.print(w + " ");
            w--;
        }
        System.out.println("\n\n--EXAMPLE OVER--\n");
        int e = 10;
        do{
            System.out.print(e + " ");
            e--;
        }while(w>1);
    }
}
