/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prv1
 */
public class Cube extends Square{
    /******** Instanced Variables **********/
    protected float depth;
    /******** Instanced Variables **********/
    
// default constructor with mutator for parent class
    public Cube(float height, float width, float depth){
        super(height, width);
        this.depth = depth;
    }
    // returns float variable back to calling method
    public float getDepth() {
        return depth;
    }
    // assigns depth variable with instanced mutator
    public void setDepth(float depth) {
        this.depth = depth;
    }
    // assigns surfaceArea variable based on variables instanced
    @Override
    public void computeSurfaceArea(){
        super.surfaceArea = 2*(depth*super.width + super.height * super.width + super.height * depth);
    }
    // returns strings to mutator
    @Override
    public String toString(){
        this.computeSurfaceArea();
        return "Height: " + super.height + " Width: " + super.width + " Depth: " + depth + " Surface Area: " + this.surfaceArea;
    }
    // returns boolean value to mutator
    @Override
    public boolean equals(Object object){
        if(object instanceof Cube){
            Cube p = (Cube) object;
            if(this.getDepth() == p.getDepth() && this.getWidth() == p.getWidth() && this.getHeight() == p.getHeight())
                return true;
        }
        
        return false;
    }


}
