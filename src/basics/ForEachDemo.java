/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basics;

/**
 *
 * @author Abhi
 */ 
public class ForEachDemo {
    public static void main(String[] args) {
        String[] alphabets ={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        for(String x: alphabets){
            System.out.print(x + " ");
        }
    }
}
