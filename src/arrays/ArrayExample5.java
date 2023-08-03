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
public class ArrayExample5 {
    public static void main(String[] args) {
        //copying elements from one array to another array.
        //initializing first array.
        int[] a={54,36,97,18,20};
        System.out.print("Default array is: ");
        for(int p:a){
            System.out.print(p+" ");
        }
        System.out.println("\n\n--EXAMPLE OVER--\n");
        //initializing second array of same length.
        int[] b=new int[5];
        //loop for traversing thru first array.
        for(int i=0;i<a.length;i++){
            //loop for traversing while copying data from one array to another.
            for(int j=0;j<=i;j++){
                b[i]=a[i];
            }
        }
        //printing array b.
        System.out.print("Copy array -> b is: ");
        for(int x:b){
            System.out.print(x+" ");
        }
        System.out.println("\n\n--EXAMPLE OVER--\n");
        
        //reverse copying an array.
        //initializing new array.
        int[] c=new int[5];
        //copy values from first array to second.
        for(int i=a.length-1;i>=0;i--){
            //we want one length minus total length hence we write this 'a.length-1-i'.
            for(int j=0;j<=i;j++){
                c[j]=a[a.length-1-i];
            }
        }
        System.out.print("Reverse Copy array -> c is: ");
        for(int r:c){
            System.out.print(r +" ");
        }
    }
}
