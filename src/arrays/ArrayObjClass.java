/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arrays;

class Subject{
    private String subID;
    private String sName;
    private int maxMarks;
    private int marksObtain;
    
    //constructors have no return type, it has to be the same name as the class.
    //if we do not create a constructor, compiler will automatically make one which will be called default constructor. default constructor will not have any parameter, hence also called as no-args constructor.
    //parameterized constructor. wherever there is a need of initialization of a variable with value at the creation of an object, we use parameterized constructor. 
    public Subject(String subID, String sName, int maxMarks){
        //this.subID refers to the property of the Subject class, ie. on line 10(check color of both subID in ide)
        this.subID = subID;
        this.sName = sName;
        this.maxMarks = maxMarks;
    }
    
    //getter methods of every variable.
    public String getSubID(){
        return subID;
    }
    public String getName(){
        return sName;
    }
    public int getMaxMarks(){
        return maxMarks;
    }
    public int getMarksObtain(){
        return marksObtain;
    }
    
    //setter methods of only the parameters which are supposed to be set(by the user and not while object creation)
    public void setMaxMarks(int mm){
        maxMarks=mm;
    }
    public void setMarksObtain(int mo){
        marksObtain=mo;
    }
    
    //if student has more than 40% then only passed else fail.
    boolean isQualified(int m){
        return marksObtain>=maxMarks/10*4;
    }
    public String toString(){
        return "\nSubject ID: "+subID+"\nSubject Name: "+sName+"\nMarks Obtained: "+marksObtain;
    }
}

public class ArrayObjClass {
    public static void main(String[] args) {
        //this is a reference to array of 3 subjects. this is not an object, it is a reference(pointer)
        //every reference will have all properties of the subject class, ie. first array element will have all 4 properties, second array element will have all 4 properties, etc. they are created separately, individually.
        Subject sub[] = new Subject[3];
        //while creating the objects, we are passing these 3 parameters. these are used by the constructor while creating the object of Subject Class.
        sub[0] = new Subject("101","Python Programming",100);
        sub[1] = new Subject("102","Web Technology",100);
        sub[2] = new Subject("103","Database Application",100);
        
        //here, we haven't passed the necessary values ie. the setXXX() ones of the Subject Class, hence will give output as 0.
        for(Subject s:sub){
            System.out.println(s);
        }
        System.out.println("\n--EXAMPLE OVER--");
        //here, we have set the marks obtained of all the objects. hence, when we print it will give proper output.
        sub[0].setMarksObtain(63);
        sub[1].setMarksObtain(75);
        sub[2].setMarksObtain(82);
        for(Subject s:sub){
            System.out.println(s);
        }
    }
}
