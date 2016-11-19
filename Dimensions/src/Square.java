/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prv1
 */
public class Square {
    /******** Instanced Variables **********/
    protected float height, width, surfaceArea;
    /******** Instanced Variables **********/
    // default constructor
    public Square(float height, float width){
        this.height = height;
        this.width = width;
        surfaceArea = width*height;
    }
    // returns height variable back to calling method
    public float getHeight() {
        return height;
    }
    // sets the value of height with the passed float variable
    public void setHeight(float height) {
        this.height = height;
    }
    // returns width variable back to calling method
    public float getWidth() {
        return width;
    }
    // sets the value of width with the passed float variable
    public void setWidth(float width) {
        this.width = width;
    }

    public float getSurfaceArea() {
        return surfaceArea;
    }
    // sets the value of surfaceArea with the passed float variable
    public void setSurfaceArea(float surfaceArea) {
        this.surfaceArea = surfaceArea;
    }
    // sets the value of surfaceArea based on height and width
    public void computeSurfaceArea(){
        surfaceArea = height*width;
    }
    // returns string back to calling method
    public String toString(){
        return "Height: " + height + " Width: " + width + " Surface Area: " + surfaceArea;
    }
    // returns boolean to calling method
    public boolean Equals(Object object){
        if(object instanceof Square){
            Square p = (Square) object;
            if(this.getHeight() == p.getHeight() && this.getWidth() == p.getWidth())
                return true; // exits out of method if true
        }
        return false; // returns false if not true
    }
    
}
