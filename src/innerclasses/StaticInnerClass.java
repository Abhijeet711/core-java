/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author Abhi
 */

package innerclasses;

class StaticOuter{
    int x = 7;
    static int y = 11;
    
    static class testS{
        public void show(){
            //here, inside a static inner class we can only access the variables which are static in outer class. hence, you cannot access the variable x inside the show()
            System.out.println(y);
        }
    }
}

public class StaticInnerClass {
    public static void main(String[] args) {
        StaticOuter.testS ts = new StaticOuter.testS();
        ts.show();
    }
}
