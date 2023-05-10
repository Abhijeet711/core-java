/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 * @author Abhi
 */

package oopsbasics;

class GSE{
    private String name;
    private int salary;
    
    public String getName() { //
        return name;
    }
    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Name: "+getName()+", Salary: "+getSalary();
    }
}

public class GetterSetter {
    public static void main(String[] args) {
        GSE g = new GSE();
        //here, if you set the value of Name and Salary using object of the class, it will give error because the variable is set to private so nobody can directly access it. you've to make getXXX() and setXXX() methods to get and set the private variables.
        //g.name = "abhi"; this will give following error: Uncompilable source code - name has private access in random.GSE at random.GetterSetter.main
        g.setName("carti");
        g.setSalary(100000);
        System.out.println("Details -> "+g);
        GSE s = new GSE();
        s.setName("ace");
        s.setSalary(80000);
        System.out.println("Details -> "+s);
    }
}
