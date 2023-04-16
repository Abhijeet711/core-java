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
public class ObjectMethod {
    static void update(int A[]){
        A[2] = 7;
    }
    
    //in methods, if an object is passed its value of actual object will be modified, but if the datatype of that object is primitive, the value won't be modified wh.
    public static void main(String[] args) {
        int A[] = {1,2,3,4,5};
        System.out.print("Array before update(): ");
        for(int x:A){
            System.out.print(x + " ");
        }
        System.out.println("");
        System.out.print("Array after update(): ");
        update(A);
        for(int x:A){
            System.out.print(x + " ");
        }
    }
}
