/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package point2d;

/**
 *
 * @author prv1
 */
public class Point2D {
private int x,y;


    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    
    // default constructor that sets default variables if no parameters are entered during initialization
    public Point2D(){
        this.x = 0;
        this.y = 0;
        
    }
    // contstructor when two int variables are passed through instance
    public Point2D(int x,int y){
        this.x = x;
        this.y = y;
    }
    // constructor when one int is passed through instance
    public Point2D(int xy){
        this.x = xy;
        this.y = xy;
    }
    // gets the value of x and returns it back to the method calling it
    public int getx(){
        return x;
    }
    // gets the value of y and returns it back to the method calling it
    public int gety(){
        return y;
    }
    // sets the value of x with the passed int variable
    public void setx(int x){
        this.x = x;
    }
    // sets the value of x with the passed int variable
    public void sety(int y){
        this.x = y;
    }
    
    public boolean Equals(Object object){
        if(object instanceof Point2D){
            Point2D p = (Point2D) object;
            if(this.getx() == p.getx() && this.gety() == p.gety())
                return true;
        }
        return false;
    }
    // converts int variables to string format
@Override
    public String toString(){

        return "(" + x + ", " + y + ")";
    }
    

    
}
