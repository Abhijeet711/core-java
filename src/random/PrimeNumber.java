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
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n;
        System.out.print("Enter a number: ");
        n = sc.nextLong();
        if(n==0 || n==1){
            System.out.println(n+" is neither prime not composite. ");
        }else{
            int count=0;
            for(int i=1;i<=n;i++){
                if(n%i==0) 
                    count++;
            }
            if(count == 2)
                System.out.println(n + " is a prime number.");
            else
                System.out.println(n + " is not a prime number.");
        }
    }
}
