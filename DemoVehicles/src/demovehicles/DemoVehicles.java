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
public class DemoVehicles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Sailboat aBoat = new Sailboat();// TODO code application logic here
        //Bicycle aBike = new Bicycle();
        //JOptionPane.showMessageDialog(null, "\nVehicle Descriptions: \n" + aBoat.toString() + "\n" + aBike.toString());
        
        Vehicle[] vehicles = new Vehicle[5];
        int x;
        
        for(x = 0; x < vehicles.length; ++x){
            String userEntry;
            int vehicleType;
            userEntry = JOptionPane.showInputDialog(null, "Please select the type of \n" + "vehicle you want to enter: \n1 - Sailboat\n" + "2 - Bicycle");
            vehicleType = Integer.parseInt(userEntry);
            if(vehicleType == 1)
                vehicles[x] = new Sailboat();
            else
                vehicles[x] = new Bicycle();
            
            
        }
        
        StringBuffer outString = new StringBuffer();
        for(x = 0; x < vehicles.length; ++x){
            outString.append("\n#" + (x+1) + " ");
            outString.append(vehicles[x].toString());
            
        }
        
        JOptionPane.showMessageDialog(null, "Our available Vehicles include:\n" + outString);
        InsuredCar myCar = new InsuredCar();
        JOptionPane.showMessageDialog(null,
            myCar.toString());
    }
    
}
