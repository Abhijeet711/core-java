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
public class StringReversal {
    public static void main(String[] args) {
        String test = "Humpty dumpty sat on the wall";
        String test1 = "Johnny johnny yes papa";
        char[] arr = test.toCharArray();
        int n = arr.length;
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]);
        }
        System.out.println("\n\n--EXAMPLE OVER--\n");
        String[] a = test1.split(" ");
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
    }
}
