/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 12, 1};
        System.out.print("Array before sorting: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        boolean swapped;
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            // inner loop to compare adjacent elements and swap if necessary
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // if no swaps were made in the inner loop, the array is already sorted
            if (!swapped) {
                break;
            }
        }

        System.out.println("");
        // print the sorted array
        System.out.print("Array after sorting: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
