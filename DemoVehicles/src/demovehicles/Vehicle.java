/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demovehicles;

/**
 *
 * @author phillip389
 */
public abstract class Vehicle {
    private String powerSource;
    private int wheels;
    protected int price;
    
    public Vehicle(String powerSource, int wheels){
        setPowerSource(powerSource);
        setWheels(wheels);
        setPrice();
    }

    public String getPowerSource() {
        return powerSource;
    }

    public void setPowerSource(String powerSource) {
        this.powerSource = powerSource;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getPrice() {
        return price;
    }

    public abstract void setPrice();
    
    
    
}
