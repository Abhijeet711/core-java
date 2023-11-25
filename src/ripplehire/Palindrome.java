/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ripplehire;

/**
 *
 * @author Abhi
 */
public class Palindrome {
    public static void main(String[] args) {
        String x = "test123";
        char[] arr = x.toCharArray();
        int n = arr.length; 
        StringBuilder sb = new StringBuilder();
        for(int i=n-1;i>=0;i--){
            sb.append(arr[i]);
        }
        if(x.equals(sb.toString())){
            System.out.println("Palindrome.");
        }else{
            System.out.println("Not a palindrome.");
        }
    }
}
