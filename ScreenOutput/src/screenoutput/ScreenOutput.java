/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screenoutput;
import java.io.*;

/**
 *
 * @author phillip389
 */
public class ScreenOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = "ABCDF";// TODO code application logic here
        byte[] data = s.getBytes();
        OutputStream output = null;
        try{
            output = System.out;
            output.write(data);
            output.flush();
            output.close();
        }
        catch(Exception e){
            System.out.println("Message" + e);
        }
    }
    
}
