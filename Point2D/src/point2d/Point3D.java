/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package point2d;

/**
 *
 * @author phillip389
 */
public class Point3D extends Point2D {
    protected int z;
    
    public Point3D(){
        super();
        this.z = 0;
    }
    
    public Point3D(int xyz){
        
    }
    
    
    public Point3D(int x, int y, int z){
        
    }
    
    public void setZ(int z){
        
    }
    public int getZ(){
        return this.z;
    }

    public boolean Equals(Object object){
        if(object instanceof Point3D){
            Point3D p = (Point3D) object;
            if(this.getZ() == p.getZ() && this.gety() == p.gety() && this.getx() == p.getx())
                return true;
        }
        return false;
    }

    
    @Override
    public String toString(){
        return "";
    }
}
