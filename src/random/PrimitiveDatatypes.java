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
public class PrimitiveDatatypes {
    public static void main(String[] args){
        
        //can only be true or false, size -> 1 bit.
        boolean a = true;
        boolean a1 = false;
        System.out.println("boolean a: "+a);
        System.out.println("boolean a1: "+a1);
        
        //range -> -128 to 127, default value = 0, size -> 1 byte.
        byte b = 55; //cannot be byte b = -129 or byte b = 129.
        System.out.println("byte: "+b);
        
        //contains maximum value of -32,768 and a maximum value of 32,767, default value is 0, size -> 2 bytes.
        short d = 10;
        System.out.println("short: "+d);
       
        //contains minimum value of -2^31 and a maximum value of (2^31)-1, default value is 0L, size -> 4 bytes.
        int e = 37;
        System.out.println("int: "+e);
        
        //contains minimum value of -2^63 and a maximum value of (2^63)-1, default value is 0L, size -> 8 bytes.
        long f = 92233036854775808L;
        long f1 = -15L; //can be defined like this as well.
        System.out.println("long f: "+f);
        System.out.println("long f1: "+f1);
        
        //range -> 0 to 65535, default value is '\u0000', size -> 2bytes, written in single quotes.
        char c = 'a'; //cannot give char c = "A".
        System.out.println("char c: "+c);
        //we can also give integer value to char variable. compiler will implicitly typecast integer to char and display the corresponding ASCII  value.    
        char c1 = 104;
        System.out.println("char c1: "+c1);
        
        //default value is 0.0f, size -> 4 bytes.
        float g = 26.11f;
        System.out.println("float: "+g);
        
        //default value is 0.0d, size -> 8 bytes.
        double h = 5.5d;
        System.out.println("double: "+h);
    }
}
