/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demovehicles;
import javax.swing.*;
/**
 *
 * @author phillip389
 */
public class Bicycle extends Vehicle {
    
    public Bicycle(){
        super("a person", 2);
    }
    
    public void setPrice(){
        String entry;
        final int MAX = 4000;
        entry = JOptionPane.showInputDialog(null, "Enter bicycle price ");
        price = Integer .parseInt(entry);
        if(price > MAX)
            price = MAX;
    }
    
    public String toString(){
        return ("The bicycle is powered by " + getPowerSource() + "; it has " + getWheels() + " wheels and costs $" + getPrice());
    }
    
    
}
