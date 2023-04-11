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
    }
}
