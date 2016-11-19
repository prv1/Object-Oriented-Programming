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
public class Person {
    /****** Instanced Variables *******/
    private String lName, fName, streetAddress;
    private int zip;
    private String phone;
    /****** Instanced Variables *******/
    /**
     *
     * @param fName
     * @param lName
     * @param streetAddress
     * @param zip
     * @param phone
     */
    
    // default constructor
    public Person(String fName, String lName, String streetAddress, int zip, String phone){
        this.fName = fName;
        this.lName = lName;
        this.streetAddress = streetAddress;
        this.phone = phone;
        this.zip = zip;
    }
    
    public Person(){
        
    }
    // returns variable lName in string format
    public String getlName() {
        return lName;
    }
// sets lName variable from passed mutator
    public void setlName(String lName) {
        this.lName = lName;
    }
    // returns variable fName in string format
    public String getfName() {
        return fName;
    }
// sets fName variable from passed mutator
    public void setfName(String fName) {
        this.fName = fName;
    }
// returns variable streetAddress in string format
    public String getStreetAddress() {
        return streetAddress;
    }
// sets streetAddress variable from passed mutator
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }
// returns variable zip in integer format
    public int getZip() {
        return zip;
    }
// sets zip variable from passed mutator
    public void setZip(int zip) {
        this.zip = zip;
    }
// returns variable phone in string format
    public String getPhone() {
        return phone;
    }
// sets phone variable from passed mutator
    public void setPhone(String phone) {
        this.phone = phone;
    }
    // displays all variables in string format
    @Override
    public String toString(){
        return "First Name: " + this.getfName() + " Last Name: " + this.getlName() + " Street Address: " + this.getStreetAddress() + " Zip: " + this.getZip() + " Phone: " + this.getPhone() + " ";
    }
    

}
