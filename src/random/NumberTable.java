/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package random;

import java.util.Scanner;

/**
 *
 * @author Abhi
 */
public class NumberTable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of a table you want: ");
        int n = sc.nextInt();
        for(int i = 1; i<11; i++){
            System.out.println(i*n);
        }
    }
}
