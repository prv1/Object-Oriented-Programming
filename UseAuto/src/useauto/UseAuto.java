/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package useauto;

/**
 *
 * @author phillip389
 */
public class UseAuto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ford myFord = new Ford();// TODO code application logic here
        Chevy myChevy = new Chevy();
        System.out.println("A new " + myFord.getName() + " costs $" + myFord.getPrice());
        System.out.println("A new " + myChevy.getName() + " costs $" + myChevy.getPrice());
    }
    
}
