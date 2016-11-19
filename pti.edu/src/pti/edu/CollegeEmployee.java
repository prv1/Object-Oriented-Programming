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
public class CollegeEmployee extends Person{
    /****** Instanced Variables *******/
    private long ssn;
    private String deptName;
    private float salary;
    /****** Instanced Variables *******/
    /**
     *
     * @param fName
     * @param lName
     * @param streetAddress
     * @param zip
     * @param phone
     * @param ssn
     * @param deptName
     * @param salary
     */
    // default constructor and default instance to parent class
    public CollegeEmployee(String fName, String lName, String streetAddress, int zip, String phone, long ssn, String deptName, float salary){
        super(fName,lName,streetAddress,zip,phone);// instances variables to parent class
        this.ssn = ssn;
        this.deptName = deptName;
        this.salary = salary;
    }
// returns variable ssn in long integer format    
    public long getSsn() {
        return ssn;
    }
// sets ssn variable from passed mutator
    public void setSsn(long ssn) {
        this.ssn = ssn;
    }
// returns variable deptName in String format  
    public String getDeptName() {
        return deptName;
    }
// sets deptName variable from passed mutator
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
// returns variable salary in float format  
    public float getSalary() {
        return salary;
    }
// sets salary variable from passed mutator
    public void setSalary(float salary) {
        this.salary = salary;
    }
// displays all variables in string format
    @Override
    public String toString(){
        return super.toString() + "SSN: " + this.getSsn() + " Dept Name: " + this.deptName + " Salary: $" + this.getSalary();
    }

    
}
