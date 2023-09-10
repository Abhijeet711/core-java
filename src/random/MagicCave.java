/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author Abhi
 */

package random;

/*
Question:

There is a magic cave which can increase the money with anyone who enters it. It increases the money in a curious way. The first time the person enters, the amount with the person increases by Re 1. The next time onwards, it makes the amount with the person equal to the sum of the last 2 amounts the person had when he entered the cave. Write a program which takes 2 numbers as input- 1. The initial amount with the person and 2. The target amount the person wants to get. The program must output the number of times the person must enter the cave to reach his/her target.

Sample: Input: 22 100 Output: 4

[22->In&Out->23->In&Out->45->In&Out->68->In&Out->113]
*/

import java.util.Scanner;

public class MagicCave {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the initial amount with the person: ");
        int initialAmount = scanner.nextInt();
        
        System.out.print("Enter the target amount: ");
        int targetAmount = scanner.nextInt();
        
        int numberOfEntries = findNumberOfEntries(initialAmount, targetAmount);
        
        System.out.println("Number of times the person must enter the cave to reach the target: " + numberOfEntries);
        
        scanner.close();
    }
    
    public static int findNumberOfEntries(int initialAmount, int targetAmount) {
        int currentAmount = initialAmount;
        int entries = 0;
        
        while (currentAmount < targetAmount) {
            if (entries == 0) {
                currentAmount += 1;
            } else {
                int temp = currentAmount;
                currentAmount += initialAmount;
                initialAmount = temp;
            }
            entries++;
        }
        
        return entries;
    }
}

/*
Working:
Initialize Variables: Create variables to store the initial amount, the target amount, the current amount (which starts as the initial amount), and a counter for the number of entries (initially set to 0).

Create a Loop: Use a loop to simulate the person entering the cave repeatedly until the current amount reaches or exceeds the target amount.

Inside the Loop:
If this is the first entry (counter is 0), increase the current amount by 1 (as specified in the problem).
For subsequent entries, update the current amount by adding the initial amount to it, and update the initial amount with the previous current amount (to simulate the next entry).
Increment the Entry Counter: After each entry into the cave, increment the entry counter.

Exit the Loop: Continue looping until the current amount is greater than or equal to the target amount.

Output the Result: Once the loop exits, print the value of the entry counter, which represents the number of times the person entered the cave to reach the target amount.
*/