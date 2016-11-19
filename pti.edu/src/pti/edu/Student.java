/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pti.edu;

/**
 *
 * @author phillip389
 */
public class Student extends Person {
    /****** Instanced Variables *******/
    private String major;
    private float gpa;
    /****** Instanced Variables *******/
    /**
     *
     * @param fName
     * @param lName
     * @param streetAddress
     * @param zip
     * @param phone
     * @param major
     * @param gpa
     */
    
    // default constructor and default instance to parent class
    public Student(String fName, String lName, String streetAddress, int zip, String phone, String major, float gpa){
        super(fName,lName,streetAddress,zip,phone); // instances variables to parent class
        this.major = major;
        this.gpa = gpa;
    }    
// returns variable major in string format    
    public String getMajor() {
        return major;
    }
// sets major variable from passed mutator
    public void setMajor(String major) {
        this.major = major;
    }
// returns variable float in float format
    public float getGpa() {
        return gpa;
    }
// sets gpa variable from passed mutator
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
    // displays all variables in string format   
    @Override
    public String toString(){
        return super.toString() + " Major: " + this.getMajor() + " GPA: " + this.getGpa();
    }
    

}
