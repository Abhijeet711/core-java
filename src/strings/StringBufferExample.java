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
public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello ");
        System.out.println(sb);

        //appends at end.
        sb.append("Java");
        System.out.println(sb);
        
        //inserts at the given index. (index, "string")
        sb.insert(0,"!");
        System.out.println(sb);
        
        //replaces from the specified beginIndex and endIndex. (beginIndex, endIndex, "string")
        sb.replace(0,1,"+");
        System.out.println(sb);
        
        System.out.println("\n--EXAMPLE OVER--\n");
        
        StringBuffer sb1 = new StringBuffer("Hello");
        System.out.println(sb1);
        //deletes the String from the specified beginIndex to endIndex. (beginIndex, endIndex)
        sb1.delete(1,3);
        System.out.println(sb1);
        
        sb1.reverse();
        System.out.println(sb1);
        
        System.out.println("\n--EXAMPLE OVER--\n");
        
        StringBuffer sb2=new StringBuffer();  
        System.out.println("This is empty string buffer and the capacity is -> " + sb2.capacity());//default 16  
        sb2.append("Hello");  
        System.out.print(sb2 + " ->(capacity) ");
        System.out.println(sb2.capacity());//now 16  
        sb2.append("java is my favourite language");  
        System.out.print(sb2 + " ->(capacity) ");
        System.out.println(sb2.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
    }
}
