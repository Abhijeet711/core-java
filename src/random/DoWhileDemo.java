/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package random;

/**
 *
 * @author Abhi
 */
//do-while executes the statements inside once first and then checks the condition, if condition is true it will execute or it will come out of the loop.
//do-while -> execute once then condition.
//while -> condition and execute.
public class DoWhileDemo {
    public static void main(String[] args){
        int i = 1;        
        do{
           System.out.println(i + " ");
           i++;
        }while(i>5);
        //by both of these examples you'll understand difference.
        int j = 100;
        do{
           System.out.print(j + " ");
           j++;
        }while(j<=110);
    }
}
