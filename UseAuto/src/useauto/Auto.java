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
public abstract class Auto {
    private int price;
    private String name;
    public abstract void setPrice();
    
    public Auto(String name, int price){
        this.name = name;
        this.price = price;
    }
    
    public void setPrice(int price){
        this.price = price;
    }
    

    
    public String getName(){ return name;}
    public int getPrice(){ return price;}
    
    public void setName(String name){
        this.name = name;
    }
}
