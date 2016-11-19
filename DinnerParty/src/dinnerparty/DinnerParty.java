/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinnerparty;
import java.util.*;
/**
 *
 * @author prv1
 */
public class DinnerParty {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int guests;// TODO code application logic here
        Party aParty = new Party();
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter number of guests for the party >> ");
        guests = keyboard.nextInt();
        aParty.setGuests(guests);
        System.out.println("The party has " + aParty.getGuests() + " guests");
        
        aParty.displayInvitation();
    }
    
}
