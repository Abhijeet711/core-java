/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author Abhi
 */

package algorithms;

public class LinearSearch {
    public static int LinearS(int[]arr, int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {906,903,3,27};
        int key = 88;
        int l = arr.length - 1;
        int result = LinearS(arr, key);
        if (result == -1) {
            System.out.println("Element "+key+" is not found!");
        } else {
            System.out.println("Element is found at index: " + result);
        }
    }
}
