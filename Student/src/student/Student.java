/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author prv1
 */
public class Student {
/******* Instanced Variables ************/
private int ID;
private String name;
private int year;
/******* Instanced Variables ************/
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    // constructor initializes default values for instanced variables
    public Student(){
        this.ID = 0;
        this.year = 2016;
        
    }
    
    public Student(int ID){
        this.year = ID;
        this.year = 2016;
    }
    
    public int getYear(){
        
        return year;
    }
    
    public void setYear(int year){
        this.year = year;
    }
    
}
