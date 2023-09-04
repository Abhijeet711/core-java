/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author Abhi
 */

package collectionframework;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        
        //since this is a part of generics, it only takes input as wrapper class and not primitive datatypes.
        HashMap<Integer, String> data = new HashMap<>();
        data.put(1,"abhi");
        data.put(2,"jeet");
        data.put(3,"bhu");
        data.put(4,"shan");
        data.put(5,"ankita");
        data.put(6,"sar");
        data.put(7,"thak");
        data.put(8,"kavya");
        data.put(9,"ishan");
        
        System.out.println(data); //all elements in the hashmap
        
        System.out.println("\n--EXAMPLE OVER--\n");
        
        System.out.println(data.get(1)); //string output
        
        System.out.println("\n--EXAMPLE OVER--\n"); 
        
        System.out.println(data.containsKey(10)); //boolean output
        
        System.out.println("\n--EXAMPLE OVER--\n");
        
        System.out.println(data.containsValue("never")); //boolean output
        
        System.out.println("\n--EXAMPLE OVER--\n");
        
        data.replace(2,"cartiace"); //replaces 2nd string with cartiace. can only replace the key-value if the key already exists in the map.
        System.out.println(data);
        
        System.out.println("\n--EXAMPLE OVER--\n");
        
        data.putIfAbsent(10,"found"); //if key-value doesnt exists, adds the key-value pair.
        System.out.println(data);
        
        System.out.println("\n--EXAMPLE OVER--\n");
        
        data.remove(10); //removes the key-value pair where key=10.
        System.out.println(data);
        
    }
}
