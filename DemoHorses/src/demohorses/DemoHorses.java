/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demohorses;

/**
 *
 * @author phillip389
 */
public class DemoHorses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RaceHorse horse01 = new RaceHorse();// TODO code application logic here
        RaceHorse horse02 = new RaceHorse();
        
        horse01.setName("Old Paint");
        horse01.setColor("brown");
        horse01.setBirthYear(2009);
        
        horse02.setName("Champion");
        horse02.setColor("black");
        horse02.setBirthYear(2011);
        horse02.setRaces(4);
        
        System.out.println(horse01.getName() + " is " + horse01.getColor() + " is the first horse. "
                + "" + "He was born in " + horse01.getYear() + ". " + horse02.getName() + "is the second horse"
                + " He was born in " + horse02.getYear() + ". " + horse02.getName() + " has been in " + horse02.getRaces() + " races." );
        
    }
    
}
