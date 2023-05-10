/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arrays;

/**
 *
 * @author Abhi
 */
public class ArrayExample1 {
    public static void main(String[] args) {
        //printing array in a line
        //array of size 5 with all elements as 0.
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("\n--EXAMPLE OVER--\n");
        int[] arr0 = {1,2,3,4,5};
        //printing an array in ascending order.
        System.out.println("Printing an array: ");
        for(int i=0;i<arr0.length;i++){
            System.out.print(arr0[i] + " ");
        }
        System.out.println("\n\n--EXAMPLE OVER--\n");
        //printing an array in reverse order.
        System.out.println("Printing an array in reverse order: ");
        for(int i=arr0.length-1;i>=0;i--){
            System.out.print(arr0[i] + " ");
        }
        System.out.println("\n\n--EXAMPLE OVER--\n"); 
        System.out.println("Printing an array using for reach loop:");
        int arr1[] = {1,2,3,4,5};
        for(int i:arr1){
            System.out.print(i++ + " ");
        }
        System.out.println("\n\n--EXAMPLE OVER--\n");
        //Creating a 2D array and printing it.
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        //here x is array of arrays, so while initializing we have to give [].
        for(int[] x:a){
            //now, once we traverse in array a, we have to traverse every array of a, that means x.
            for(int y:x){
                System.out.print(y);
            }
            System.out.println("");
        }
    }
}
