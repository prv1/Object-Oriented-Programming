/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author phillip389
 */
public class Calculations {
    
    int z;
    
    public void addition(int x, int y){
       z = x + y;
       ask("The sum of " + x + " + " + y + " = " +z);
    }
    
        public void subtration(int x, int y){
       z = x - y;
       ask("The sum of " + x + " - " + y + " = " +z);
    }
        
    public void multiplication(int x, int y){
       z = x * y;
       ask("The sum of " + x + " x " + y + " = " +z);
    }
    
    public void ask(String text){
        System.out.println(text);
    }
}
