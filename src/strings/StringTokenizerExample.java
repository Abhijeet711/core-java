/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.util.StringTokenizer;

/**
 *
 * @author Abhi
 */
public class StringTokenizerExample {

    public static void main(String args[]) {
        
        //here, delimiter is set to space
        StringTokenizer st1 = new StringTokenizer("Hello! How are you guys?", " ");
        // Condition holds true till there is single token
        // remaining using hasMoreTokens() method
        while (st1.hasMoreTokens()) // Getting next tokens
        {
            System.out.println(st1.nextToken());
        }
        
        System.out.println("\n--EXAMPLE OVER--\n");
        
        //delimiter is :
        StringTokenizer st2 = new StringTokenizer("JAVA : Code : String", " :");
        // If tokens are present
        while (st2.hasMoreTokens()) // Print all tokens
        {
            System.out.print(st2.nextToken());
        }

        System.out.println("\n\n--EXAMPLE OVER--\n");
        
        //third parameter is a boolean value, this boolean value specifies if the delimiter should be returned or not.
        StringTokenizer st3 = new StringTokenizer("JAVA : Code : String", " :", true);
        while (st3.hasMoreTokens()) {
            System.out.print(st3.nextToken());
        }
        System.out.print(" ");
        
        System.out.println("\n\n--EXAMPLE OVER--\n");
        
        int numTokens = st3.countTokens();
        System.out.println("Number of tokens: " + numTokens);

        System.out.println("\n--EXAMPLE OVER--\n");
        
        String str = "ABC DEF GHI";
        //this tokenizer has only one parameter, the string. so the default delimiters such as newline, spaces, tabs are considered.
        StringTokenizer st = new StringTokenizer(str);
        while(st.hasMoreElements()){
            System.out.println(st.nextToken());
        }
    }
}
