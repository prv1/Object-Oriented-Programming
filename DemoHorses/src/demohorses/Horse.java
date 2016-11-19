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
public class Horse {
    private String name, color;
    private int birthYear;
    
    public void setName(String n){
        this.name = n;
    }
    
    public void setColor(String c){
        this.color = c;
    }
    
    public void setBirthYear(int y){
        this.birthYear = y;
    }
    
    public String getName(){
        return name;
    }
    
    public String getColor(){
        return color;
    }
    
    public int getYear(){
        return birthYear;
    }
}
