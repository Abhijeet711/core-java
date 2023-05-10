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
public class ArrayExample3 {
    public static void main(String[] args) {
        int[] arr = {3,9,7,8,12,6,15,5,4,10};
        //maximum element of an array.
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum element of the array is: "+max);
        System.out.println("\n--EXAMPLE OVER--\n");
        //second largest of an array.
        int l1, l2;
        l1 = l2 = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>l1){
                l2=l1; 
                l1=arr[i];
            }
            else if(arr[i]>l2){
                l2=arr[i];
            }
        }
        System.out.println("Second largest element of the array is: "+l2);
        System.out.println("\n--EXAMPLE OVER--\n");
        //rotating an array
        int[] A = {7,4,11,26,1};
        System.out.print("Array is: ");
        //printing default array.
        for(int x:A){
            System.out.print(x + " ");
        }
        //keeping first element in temp variable.
        int temp=A[0];
        //rotating left
        for(int i=1;i<A.length;i++){
            A[i-1]=A[i];
        }
        //putting 0th index element to last index.
        A[A.length-1]=temp;
        System.out.println("");
        System.out.print("Array after one left-rotation is: ");
        for(int x:A){
            System.out.print(x + " ");
        }
        System.out.println("");
        //keeping last element in temp variable.
        int rtemp=A[A.length-1];
        //rotating right(this will make array to go back to default state)
        for(int i=A.length-2;i>=0;i--){
            A[i+1]=A[i];
        }
        //putting last element in 0th index.
        A[0]=rtemp;
        System.out.print("Array after one right-rotation is: ");
        for(int x:A){
            System.out.print(x + " ");
        }
    }
}
