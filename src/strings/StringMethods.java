/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 * @author Abhi
 */

package strings;

public class StringMethods {
    public static void main(String[] args) {
        char c[] = {'a','b','c'};
        String s = new String(c);
        System.out.println(s);
        String s1 = "top";
        String s2 = "gun";
        String s3 = "TOP";
        String s4 = "eeaao";
        String s5 = "MAVERICK";
        System.out.println("concatenation: "+s1.concat(s2));
        System.out.println("lexographical comparison: "+s1.compareTo(s2)); //compares lexographically
        System.out.println("lexographical comparison without case: "+s1.compareToIgnoreCase(s3)); //without case, gives 0 output since strings are same.
        System.out.println("compares two strings and returns true if equal: "+s1.equals(s2)); //with case
        System.out.println("compares two strings and returns true if equal without considering the case: "+s1.equalsIgnoreCase(s3)); //without case
        System.out.println("returns the length of the string: "+s3.length());
        System.out.println("checks if the input string is empty or not: "+s2.isEmpty()); //boolean output.
        System.out.println("changes the string to uppercase: "+s4.toUpperCase());
        System.out.println("changes the string to lowercase: "+s5.toLowerCase());
        String text = "yeah i saw sparks";
        // split string from space into an array of substrings.
        String[] result = text.split(" ");
        System.out.print("result = ");
        for (String str : result) {
          System.out.print(str + ", ");
        }
        System.out.println("");
        char[] arr = {'H', 'e', 'l', 'l', 'o'};
        String s6 = "";
        //returns a new String array and copies the characters into it.
        s6 = s6.copyValueOf(arr, 0, 5);
        System.out.println("Output: " + s6);
        System.out.println("checks if the string starts with given string: "+s1.startsWith("t")); //boolean output
        System.out.println("checks if the string ends with given string: "+s1.endsWith("t")); //boolean output
        System.out.println(text.substring(11,17)); //(startIndex,endIndex) indexing starts from 0.
        int test = 7355608;
        System.out.print("Datatype of 'test': ");
        System.out.println(((Object)test).getClass().getSimpleName());
        System.out.print("Datatype of 'test' after .toString(): ");
        System.out.println(((Object)test).toString().getClass().getSimpleName());
    }
}
