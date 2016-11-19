/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileout;
import java.nio.file.*;
import java.io.*;
/**
 *
 * @author phillip389
 */
public class ReadEmployeeFile {
    public static void main(String[] args){
        Path file = Paths.get("C:\\Java\\Chapter.13\\Employee.txt");
        String s = "";
        try{
            InputStream input = new BufferedInputStream(Files.newInputStream(file));
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            s = reader.readLine();
            while(s != null){
                System.out.println(s);
                s = reader.readLine();
                
            }
            reader.close();
        }
        catch(Exception e)
        {
            System.out.println("Message: " + e);
        }
    }
}
