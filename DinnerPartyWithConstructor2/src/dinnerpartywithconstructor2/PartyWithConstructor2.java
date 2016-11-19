/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinnerpartywithconstructor2;

/**
 *
 * @author prv1
 */
public class PartyWithConstructor2 {
    private int guests;
    
    public PartyWithConstructor2(int numGuests){
        guests = numGuests;
    }
    

    
    public int getGuests(){
        return guests;
    }
    
    public void setGuests(int numGuests){
        guests = numGuests;
    }
    
    public void displayInvitation(){
        System.out.println("Please come to my party");
    }
}
