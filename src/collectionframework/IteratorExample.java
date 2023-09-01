/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author Abhi
 */

package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(55);
        list.add(66);
        list.add(77);
        
        //to print as a list
        System.out.println(list);
        
        System.out.println("\n--EXAMPLE OVER--\n");
        
        //to print as a single item, we use iterator in java
        Iterator<Integer> ir = list.iterator();
        while(ir.hasNext()){ //gives boolean output, returns true if more elements are found in the iterator, else false.
            int x = ir.next(); //returns the object/element in the iterator. if no elements are found then throws NoSuchElementException. hence, we tend to use this along with hasNext()
            System.out.print(x + " ");
        }
        System.out.println("");
        
        System.out.println("\n--EXAMPLE OVER--\n");
        
        //iterator remove() is only used after using next(), it is used to remove the most recent element returned by next(). we cannot use multiple remove() after using next().
        Iterator<Integer> ir1 = list.iterator();
        while(ir1.hasNext()){
            int x = ir1.next();
            if(x==66){
                ir1.remove();
            }
        }
        //as you can see from the output, the remove() directly removes the element/object from the original collection, in our case ArrayList. as our iterator is pointing towards AL, it gets removed from that ArrayList.
        System.out.println(list);
    }
}
