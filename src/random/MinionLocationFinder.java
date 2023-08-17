/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author Abhi
 */

package random;

import java.util.Scanner;
 
/*
Question:
Consider an infinite 2D plane divided into four quadrants by the x-axis and y-axis. A minion is present at the origin, ie. 0,0  at time T=0. The minion is very confused and is trying to find his friends. He can travel in only 4 directions, positive x axis, negative x axis, positive y axis, negative y axis. Initially he is traveling in the positive x axis at a speed of 1 unit distance per unit time. 
Minion's friends are quite worried about him and reach at the origin while looking for him. They know all the turns taken by minion at various points of the time between 0 ie. beginning and N ie. present time. They hand the data to you. You have to find the current location of minion to help his friends.
The input takes 3 parameters. First is N denoting the current time unit
Second is L denoting the total turns taken by the minion between T=1 and T=N.
Third is a 2D array of size N*2 with the first element of each row denoting the time unit and the second element is denoting the turn taken by the minion. Left turn is denoted by 0 and right turn is denoted by 1

*/
//doesnt work.
public class MinionLocationFinder {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter current time: ");
        int N = scanner.nextInt(); // Current time
        System.out.println("Enter total turns: ");
        int L = scanner.nextInt(); // Total turns
        System.out.println("First enter time unit and then enter the direction: ");
        int[][] turns = new int[L][2];
        for (int i = 0; i < L; i++) {
            turns[i][0] = scanner.nextInt(); // Time unit
            turns[i][1] = scanner.nextInt(); // Turn direction
        }
        
        int x = 0, y = 0; // Initial position
        int direction = 1; // Initial direction: +x
        
        for (int t = 1; t <= N; t++) {
            for (int[] turn : turns) {
                if (turn[0] == t) {
                    direction = (direction + (turn[1] == 0 ? -1 : 1)) % 4;
                    if (direction < 0) {
                        direction += 4;
                    }
                }
            }
            
            // Move in the current direction
            if (direction == 0) {
                y++;
            } else if (direction == 1) {
                x++;
            } else if (direction == 2) {
                y--;
            } else if (direction == 3) {
                x--;
            }
        }
        
        System.out.println("Minion's current location: (" + x + ", " + y + ")");
    }

}
