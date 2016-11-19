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
public class Sailboat extends Vehicle {
    private int length;
    
    public Sailboat(){
        super("wind", 0);
        setLength();
    }
    
    public void setPrice(){
        String entry;
        final int MAX = 100000;
        entry = JOptionPane.showInputDialog(null, "Enter sailboat price ");
        price = Integer.parseInt(entry);
        if(price > MAX)
            price = MAX;
    }
    
    public void setLength(){
        String entry;
        entry = JOptionPane.showInputDialog(null, "Enter sailboat length in feet ");
        length = Integer.parseInt(entry);
    }
    
    public int getLength(){
        return length;
    }
    
    public String toString(){
        return ("The " + getLength() + " foot sailboat is powered by " + getPowerSource() + "; it has " + getWheels() + " wheels and costs $" + getPrice());
        
    }
    
}
