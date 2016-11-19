/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author phillip389
 */
public class InheritenceDemo extends Calculations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 5, b = 12;
        Calculations calc = new Calculations();
        
        calc.addition(a,b);
        calc.subtration(a, b);
        calc.multiplication(a, b);
    }
    
   
    
}
