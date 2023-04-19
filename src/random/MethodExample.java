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
public class MethodExample {
    //in methods, if an object is passed in a method its value of actual object will be modified, but if the datatype of that object is primitive, the value won't be modified.
    static void update(int A[]){
        A[2] = 7;
    }
    //return type of a method. (String return type not working, still trying to fix. the code works with void return type.)
    public static String username(String email){
        int a = email.indexOf('@');
        String uname = email.substring(0,a);
        return uname;
    }
    public static boolean isPrime(int n){
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static int GCD(int m, int n){
        while(m!=n){
            if(m>n){
                m=m-n;
            }else{
                n=n-m;
            }
        }
        return m;
    }
    public static void main(String[] args) {
        int A[] = {1,2,3,4,5};
        System.out.print("Array before update(): ");
        for(int x:A){
            System.out.print(x + " ");
        }
        System.out.println("");
        System.out.print("Array after update(): ");
        update(A);
        for(int x:A){
            System.out.print(x + " ");
        }
        
        System.out.println("\n\n--EXAMPLE OVER--\n");        
        
        String email = "abhijeet.b@somaiya.edu";
        System.out.println("Username is: " + username(email));
        
        System.out.println("\n--EXAMPLE OVER--\n");
        
        System.out.println("Is 19 a prime number?: "+isPrime(19));
        
        System.out.println("\n--EXAMPLE OVER--\n");
        
        System.out.println("GCD of 35 and 56 is: "+GCD(35,56));
    }
}
