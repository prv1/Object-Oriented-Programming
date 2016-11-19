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
public class ReadFile {
    
    public static void main(String[] args){
    
        Path file = Paths.get("C:\\Java\\Chapter.13\\Grades.txt");
        InputStream input = null;

        try{
            input = Files.newInputStream(file);
            BufferedReader reader = new
                BufferedReader(new InputStreamReader(input));
            String s = null;
            s = reader.readLine();
            System.out.println(s);
            input.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
