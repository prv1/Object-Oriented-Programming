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
public class Faculty extends CollegeEmployee {
    /****** Instanced Variables *******/
    private boolean isTenured;
    /****** Instanced Variables *******/
    // default constructor and default instance to parent class
    public Faculty(String fName, String lName, String streetAddress, int zip, String phone, long ssn, String deptName, float salary, boolean isTenured){
        super(fName,lName,streetAddress,zip,phone,ssn,deptName,salary); // instances variables to parent class
        this.isTenured = isTenured;
    }    
// returns variable isTenured in boolean format    
    public boolean isIsTenured() {
        
        return isTenured;
    }
// sets isTenured variable from passed mutator
    public void setIsTenured(boolean isTenured) {
        this.isTenured = isTenured;
    }
// displays all variables in string format    
    @Override
    public String toString(){
        if(isTenured)
            return super.toString() + " Is Tenured:  True";
        else
            return super.toString() + " Is Tenured:  False";
    }
    

}
