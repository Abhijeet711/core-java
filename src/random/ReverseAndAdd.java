/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author Abhi
 */

package random;

import java.util.Scanner;

public class ReverseAndAdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int iterations = 0;

        while (true) {
            if (isPalindrome(inputNumber)) {
                System.out.println(inputNumber + " " + iterations);
                break;
            }

            int reversedNumber = reverseNumber(inputNumber);
            inputNumber += reversedNumber;
            iterations++;
        }
    }

    private static int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    private static boolean isPalindrome(int number) {
        int original = number;
        int reversed = reverseNumber(number);
        return original == reversed;
    }
}

/*
Working:
Input: Start with an input number.

Reverse Digits: Reverse the digits of the input number.

Add: Add the reversed number to the original input number.

Palindrome Check: Check if the result is a palindrome. A palindrome is a number that reads the same from left to right and right to left.

Iteration Count: Keep track of the number of iterations (additions) performed.

Repeat or Output:

If the result is a palindrome, output the result along with the number of iterations and stop.
If the result is not a palindrome, repeat the process starting from step 2 with the new sum as the input number.
Continue: Keep repeating steps 2-6 until you find a palindrome.

Output: Once a palindrome is found, output the palindrome and the total number of iterations performed to reach it.
*/