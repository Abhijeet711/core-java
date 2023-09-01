/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author Abhi
 */

package multithreading;

import java.util.Scanner;

public class MTExample3 {
    public static void main(String[] args) {
        //we can use a for loop to use multiple number of threads. eg:
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.print("Number of Threads: ");
        x = sc.nextInt();
        
        //this will run our code for x number of threads, but we are unable to understand what thread is printing what output.
        for(int i=0;i<x;i++){
            MT MT = new MT();
            MT.start();
        }
    }
}
