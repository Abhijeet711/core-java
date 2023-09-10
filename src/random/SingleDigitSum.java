/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author Abhi
 */

package random;


/*
Question:
Write a program to take any integer N as input 10^10 <= N<=10^20. First add all the digits of N. If the sum of the digits is not a single digit number , add all the digits of  the sum till you get a single digit. Print the final single digit as the output.
Sample Input: N= 258968578959886
Output: 4 (258968578959886 -> 103 -> 4
*/

import java.util.Scanner;

public class SingleDigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer N (10^10 <= N <= 10^20): ");
        long N = scanner.nextLong();
        
        // Ensure N is within the specified range
        if (N < Math.pow(10, 10) || N > Math.pow(10, 20)) {
            System.out.println("Input is out of range.");
        } else {
            int result = calculateSingleDigitSum(N);
            System.out.println("Output: " + result);
        }
        
        scanner.close();
    }
    
    // Function to calculate the single-digit sum
    public static int calculateSingleDigitSum(long num) {
        while (num > 9) {
            long sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return (int) num;
    }
}

/*
Working:
Input: You are given an integer N with the constraint that it must be between 10^10 and 10^20.

Digit Sum: First, you need to calculate the sum of all the digits of N.

Example:
If N = 258968578959886, the digit sum would be 2 + 5 + 8 + 9 + 6 + 8 + 5 + 7 + 8 + 9 + 5 + 9 + 8 + 8 + 6 = 103.
Single Digit Check: Check if the digit sum is a single-digit number.

Repeat Until Single Digit: If the digit sum is not a single-digit number, you need to repeat the process. Calculate the sum of the digits of the current sum until you obtain a single-digit result.

Final Single Digit: Once you have a single-digit result, that is your final answer.
*/
