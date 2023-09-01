/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author Abhi
 */

package collectionframework;


//A generic class in Java is a class that can work with different data types while providing type safety. It allows you to write code that can be reused for various data types without duplicating the class's code for each specific type.
//T is commonly used as a placeholder for actual datatype.
/*advantages of generics:
    1. Type-Safety: One can hold only a single type of objects in generics.
    2. Type Casting Is Not Required
*/

class Print<T>{
    T print;
    
    public Print(T print){
        this.print = print;
    }
    
    public void printer(){
        System.out.println(print);
    }
}

public class GenericsClassExample {
    public static void main(String[] args) {
        
        //in object creation, we have used <String> again. in the integer example you'll see that using only <>(diamond interface) is also possible.
        Print<String> p = new Print<String>("cartiace");
        System.out.print("Output of String datatype: ");
        p.printer();
        
        System.out.println("\n--EXAMPLE OVER--\n");
        
        //as mentioned above, print<> is only used with diamond interface and still giving correct output.
        Print<Integer> p1 = new Print<>(55);
        System.out.print("Output of Integer datatype: ");
        p1.printer();
        
    }
}
