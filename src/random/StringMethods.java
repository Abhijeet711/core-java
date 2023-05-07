/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 * @author Abhi
 */

package random;

public class StringMethods {
    public static void main(String[] args) {
        String s1 = "top";
        String s2 = "gun";
        String s3 = "TOP";
        String s4 = "eeaao";
        String s5 = "MAVERICK";
        System.out.println(s1.concat(s2));
        System.out.println(s1.compareTo(s2)); //compares lexographically
        System.out.println(s1.compareToIgnoreCase(s3)); //without case, gives 0 output since strings are same.
        System.out.println(s1.equals(s2)); //with case
        System.out.println(s1.equalsIgnoreCase(s3)); //without case
        System.out.println(s3.length());
        System.out.println(s2.isEmpty()); //boolean output.
        System.out.println(s4.toUpperCase());
        System.out.println(s5.toLowerCase());
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
        System.out.println(s1.startsWith("t")); //boolean output
        System.out.println(s1.endsWith("t")); //boolean output
        System.out.println(text.substring(11,17));//(startIndex,endIndex) indexing starts from 0.
        int test = 7355608;
        System.out.print("Datatype of 'test': ");
        System.out.println(((Object)test).getClass().getSimpleName());
        System.out.print("Datatype of 'test' after .toString(): ");
        System.out.println(((Object)test).toString().getClass().getSimpleName());
    }
}
