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
//StringBuilder is same as StringBuffer, only StringBuilder is non-synchronized.
public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello ");  
        sb.append("Java");//now original string is changed  
        System.out.println(sb);//prints Hello Java
        
        sb.insert(1,"Java");//now original string is changed  
        System.out.println(sb);
        
        sb.replace(1,3,"Java");  
        System.out.println(sb);
        
        sb.delete(1,3);  
        System.out.println(sb);
        
        sb.reverse();  
        System.out.println(sb);
        
        System.out.println("\n--EXAMPLE OVER--\n");
        
        StringBuilder sb1=new StringBuilder();  
        System.out.println(sb1.capacity());//default 16    
        sb1.append("Hello");    
        System.out.println(sb1.capacity());//now 16    
        sb1.append("Java is my favourite language");    
        System.out.println(sb1.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2    
    }
}
