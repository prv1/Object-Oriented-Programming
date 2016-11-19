/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package useanimal;

/**
 *
 * @author phillip389
 */
public abstract class Animal {
private String name;

public abstract void speak();

    public String getName(){
        return name;
    }
    
    public void setName(String animalName){
        name = animalName;
    }

    
}
