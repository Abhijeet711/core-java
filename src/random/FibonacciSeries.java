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
public class FibonacciSeries {
    public static void FNS(int count){
        int sum = 0;
        int n1 = 0;
        int n2 = 1;
        System.out.print(n1+" "+n2);
        for(int i=2; i<=count;++i){
            sum = n1 + n2;
            System.out.print(sum+" ");
            n1=n2;
            n2=sum;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        FNS(n);
    }
}
