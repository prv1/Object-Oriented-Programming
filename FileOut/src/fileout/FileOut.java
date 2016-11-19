/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileout;
import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
/**
 *
 * @author phillip389
 */
public class FileOut {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ReadEmployeeFile2.main(args);
        
        Path file = 
            Paths.get("C:\\Java\\Chapter.13\\Grades.txt");// TODO code application logic here
        String s = "ABCDF";
        byte[] data = s.getBytes();
        OutputStream output = null;
        try{
            output = new
                BufferedOutputStream(Files.newOutputStream(file));
            output.write(data);
            output.flush();
            output.close();
        }
        catch(Exception e){
            System.out.println("Message: " + e);
        }
    }
    
}
