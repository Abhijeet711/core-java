/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author Abhi
 */

package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("lost");
        list.add("never");
        list.add("found");
        
        //to print as a list
        System.out.println(list);
        System.out.println("\n--EXAMPLE OVER--\n");
        
        //to print as a single item, we use iterator in java
        Iterator<String> ir = list.iterator();
        while(ir.hasNext()){
            String x = ir.next();
            System.out.print(x + " ");
        }
        System.out.println("");
        
        System.out.println("\n--EXAMPLE OVER--\n");
        
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(127);
        list1.add(55);
        list1.add(84);
        System.out.println("List before using Collections.sort(): "+list1);
        Collections.sort(list1);
        System.out.println("List after using Collections.sort(): "+list1);
        //to sort in reverse order
        Collections.sort(list1, Collections.reverseOrder());
        System.out.println("List after reverse sorting using Collections.sort(al, Collections.reverseOrder()): "+list1);
        
        //Whenever we use sort() for any collection, here for ArrayList, the ArrayList modifies the order of elements in original AL memory. It doesn't create a new AL or doesn't only alter the output. The sorting is done in the existing AL.
    }
}
