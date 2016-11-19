/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinnerpartywithconstructor2;
import java.util.*;
/**
 *
 * @author prv1
 */
public class DinnerPartyWithConstructor2 extends PartyWithConstructor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int guests;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter number of guests for the party >> ");
        guests = keyboard.nextInt();

        DinnerPartyWithConstructor2 aDinnerParty = new DinnerPartyWithConstructor2(guests);
        System.out.println("Guests " + aDinnerParty.getGuests());
    }
    
    public DinnerPartyWithConstructor2(int numGuests){
        super(numGuests);
        
    }
}
