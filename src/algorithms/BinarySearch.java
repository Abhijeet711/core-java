/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author Abhi
 */
package algorithms;

public class BinarySearch {

    public static int binarySearch(int[] arr, int f, int l, int key) {
        if (l >= f) {
            int mid = f + (l - f) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) {
                return binarySearch(arr, f, mid - 1, key); 
            } else {
                return binarySearch(arr, mid + 1, l, key);  
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = {7,11,26,33,55};
        int key = 26;
        int l = arr.length - 1;
        int result = binarySearch(arr, 0, l, key);
        if (result == -1) {
            System.out.println("Element "+key+" is not found!");
        } else {
            System.out.println("Element is found at index: " + result);
        }
    }
}
