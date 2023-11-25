/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oopsbasics;

/**
 *
 * @author Abhi
 */
public class VariableArguments2 {
    //maximum of all args passed.
    static int max(int...A){
        if(A.length==0){
            return Integer.MIN_VALUE;
        }
        int max=A[0];
        for(int i=1;i<A.length;i++){
            if(A[i]>max){
                max=A[i];
            }
        }
        return max;
    }
    //sum of all args passed.
    static int sum(int...B){
        int sum=0;
        for(int i=0;i<B.length;i++){
            sum=sum+B[i];
        }
        return sum;
    }
    //discount calculator.
    static double discount(double...price){
        double discount=0;
        double sum=0;
        for(int i=0;i<price.length;i++){
            sum=sum+price[i];
        }
        if(sum<=1000){
            discount=sum*0.10;
        }else if(sum<5000){
            discount=sum*0.20;
        }else{
            discount=sum*0.30;
        }
        return discount;
    }
    public static void main(String[] args) {
        System.out.println("Max is: "+max(1,8,6,7,2));
        System.out.println("Max is: "+max(new int[]{51,26,34})); //passing an array
        System.out.println("\n--EXAMPLE OVER--\n");
        System.out.println("Sum is: "+sum(1,2,3,4,5));
        System.out.println("Sum is: "+sum(new int[]{11,22,33}));
        System.out.println("\n--EXAMPLE OVER--\n");
        System.out.println("Discount is: "+discount(1000));
        System.out.println("Discount is: "+discount(new double[]{1000,3000,5000}));
    }
}
