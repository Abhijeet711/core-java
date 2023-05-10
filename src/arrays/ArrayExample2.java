/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arrays;

import java.util.Scanner;

/**
 *
 * @author Abhi
 */
public class ArrayExample2 {
    public static void main(String[] args) {
        int[] arr = {3,9,7,8,12,6,15,5,4,10};
        //sum of elements in an array.
        int sum = 0;
        for(int x:arr){
            sum = sum + x;
        }
        System.out.println("Sum of elements in array = " + sum);
        System.out.println("\n--EXAMPLE OVER--\n");
        //searching an elements in an array.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key: ");
        int key = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(key==arr[i]){
                System.out.println("Element found at index: " + i);
                System.exit(0); //this will stop the program here, if the element is found.
            }
        }
        System.out.println("Element not found.");
        System.out.println("\n--EXAMPLE OVER--\n");
    }
}
