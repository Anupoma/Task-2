/*
Name   : Anupoma Angasree Toma
ID     : 2012020060
Section: B
Email  : cse_2012020060@lus.ac.bd
Date   : 09-08-2021
*/

package toma;
public class Student {
    String name;
    int id;
    static String universityName = "Leading University";
    
    Student(){
        System.out.println("This is default constructor!");
    }
    Student(int id){
        this.id = id;
    }
    Student(int id, String name){
        this.id = id;
        this.name = name;
        System.out.println("Student Name: "+this.name);
        System.out.println("ID: "+this.id);
    }
    void display(){
        System.out.println("University Name: "+ universityName);
    }

}
