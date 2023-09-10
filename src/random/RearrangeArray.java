/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author Abhi
 */

package random;

/*
Question:

Write a program that takes an array of size N as input. 10s Ns 100. All values of the array must be non-repeating natural numbers. Your program must arrange the numbers in such a way that The lowest value of the array must be in index (0), which is the start of the array The value in an even index location is lower than the preceding and succeeding odd index locations (eg, value in index[2] is lower than the values stored in index [1] and index [3]

Note: DO NOT ONLY SORT THE ENTIRE ARRAY USING ANY OF THE SORTING ALGORITHMS

Sample:-
N:10
Input array: 12,10,4,5,7,13,9,8,12,31 
Output: 12,10,4,7,5,11,9,12,3,81
 */
import java.util.Scanner;

public class RearrangeArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array (between 10 and 100): ");
        int N = input.nextInt();

        if (N < 10 || N > 100) {
            System.out.println("Invalid array size. Size must be between 10 and 100.");
            return;
        }

        int[] inputArray = new int[N];
        int[] evenArray = new int[N / 2];
        int[] oddArray = new int[N / 2];

        // Input the array elements
        System.out.println("Enter " + N + " non-repeating natural numbers:");
        for (int i = 0; i < N; i++) {
            inputArray[i] = input.nextInt();
        }

        // Separate even and odd elements into two arrays
        int evenIndex = 0;
        int oddIndex = 0;
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                evenArray[evenIndex] = inputArray[i];
                evenIndex++;
            } else {
                oddArray[oddIndex] = inputArray[i];
                oddIndex++;
            }
        }

        // Sort both even and odd arrays
        java.util.Arrays.sort(evenArray);
        java.util.Arrays.sort(oddArray);

        // Merge the sorted even and odd arrays back into the inputArray
        evenIndex = 0;
        oddIndex = 0;
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                inputArray[i] = evenArray[evenIndex];
                evenIndex++;
            } else {
                inputArray[i] = oddArray[oddIndex];
                oddIndex++;
            }
        }

        // Print the rearranged array
        System.out.print("Output: ");
        for (int i = 0; i < N; i++) {
            System.out.print(inputArray[i]);
            if (i < N - 1) {
                System.out.print(", ");
            }
        }

        input.close();
    }
}

/*
Working:
Input Array Size (N):
Begin by taking input from the user for the size of the array (N), ensuring it's between 10 and 100. This represents the number of elements in the array.

Input Array Elements:
Prompt the user to input N non-repeating natural numbers into the array. You can use a loop to collect these values.

Sorting the Array:
Sort the input array in ascending order. You can use built-in sorting functions like Arrays.sort() in Java to do this. This step ensures that the array is in increasing order.

Rearranging the Array:
Create a temporary array to store the rearranged values.
Initialize two pointers, one for even indices (starting from 0) and another for odd indices (starting from the last index).

Iterate through the sorted array:
For each even index, assign the value at the even-indexed pointer to the temporary array and increment the even-indexed pointer.
For each odd index, assign the value at the odd-indexed pointer to the temporary array and decrement the odd-indexed pointer.
This rearrangement ensures that even-indexed values are smaller than their adjacent odd-indexed values.

Copy Rearranged Values:
Copy the values from the temporary array back to the original array to store the rearranged values in the original array.
*/