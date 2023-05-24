/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package strings;

/**
 *
 * @author Abhi
 */
public class VariableArguments1 {
     //varargs allows the method to accept zero or muliple arguments. can be only one variable argument in the method. varargs must be the last argument. varargs uses ellipsis i.e. three dots after the data type.
    static void show(int...A){
        for(int x:A){
            System.out.print(x+" ");
        }
    }
    
    static void showNames(String...X){
        for(int i=0;i<X.length;i++){
            System.out.println((i+1)+". "+X[i]);
        }
    }
    public static void main(String[] args) {
        show(); //can pass null, this will print empty space.
        
        System.out.println("\n--EXAMPLE OVER--\n");
        
        show(1,2,3,4); //can pass multiple elements of same datatype
        
        System.out.println("\n\n--EXAMPLE OVER--\n");
        
        show(new int[]{10,20,30,40}); //can pass array of same datatype
        
        System.out.println("\n\n--EXAMPLE OVER--\n");
        
        showNames("lost","never","found");
    }
}
 