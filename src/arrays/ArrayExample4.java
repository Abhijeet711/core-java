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
public class ArrayExample4 {
    public static void main(String[] args) {
        //inserting in an array.
        //initializing the array.
        int[] a = new int[10];
        //6 elements out of 10.
        a[0]=5;
        a[1]=9;
        a[2]=6;
        a[3]=10;
        a[4]=12;
        a[5]=7;
        //number of elements.
        int n=6;
        //printing elements before inserting.
        System.out.print("Array before inserting an element is: ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        //new element.
        int x=20;
        //index where it should be inserted at.
        int index=2;
        //moving elements one place to the right from index to endIndex.
        for(int i=n;i>index;i--){
            a[i]=a[i-1];
        }
        a[index]=x;
        System.out.println("");
        System.out.print("Array after inserting an element is: ");
        for(int w:a){
            System.out.print(w+" ");
        }
        
        //deleting an element from an array.
        //we cannot delete an element from array directly.
    }
}
