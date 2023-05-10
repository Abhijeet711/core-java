/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 * @author Abhi
 */

package interfaces;

interface Member{
    void callback();
}

class Store{
    Member members[] = new Member[10]; 
    int count=0;
    void register(Member m){
        members[count++]=m;
    }
    
    void inviteSale(){
        for(int i=0; i<count; i++){
            members[i].callback();
        }
    }
}

class Customer implements Member{
    String name;
    public Customer(String n){
        name=n;
    } 
    @Override
    public void callback(){
        System.out.println("Okay, I will visit, "+name+".");
    }
}

public class InterfacesExample3 {
    public static void main(String[] args) {
        Store s = new Store();
        Customer c1 = new Customer("Abhi");
        Customer c2 = new Customer("carti");
        s.register(c1);
        s.register(c2);
        s.inviteSale();
    }
}
