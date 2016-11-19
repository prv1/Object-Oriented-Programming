/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical_quiz_3;
import java.nio.file.*;
import java.io.*;
import java.nio.file.attribute.*;
import java.io.IOException;

/**
 *
 * @author phillip389
 */
public class Practical_Quiz_3 {
private static final Path filePath = Paths.get("words.txt");  //path to file
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        InputStream input = null;
        //OutputStream output = null;
        
        
        try(BufferedReader br = new BufferedReader(new FileReader("" + filePath))){

            input = Files.newInputStream(filePath);
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            
            String[] arr;
            String s = "";
            int count = 0;
            while((s = br.readLine()) != null){ // reads each line until no longer null
                say(s);
                s = br.readLine();
                
                arr = s.split(" "); 
                count += arr.length; // add arr length to counter
                
                for(int i = count - 1; i != 0; i--){
                    say("" + arr[i]);
                }
                 
            }
           
            
            //arr = s.split(" ");
            
            
            



            
            BasicFileAttributes attr = Files.readAttributes(filePath, BasicFileAttributes.class);// creates file attribute class
            say("File Size: " + attr.size() + " bytes"); // displays file size
            say("Creation Time: " + attr.creationTime()); // displays creation time
            say("Modified Time: " + attr.lastModifiedTime()); // displays last modified time
            say("Path: " + filePath.toAbsolutePath()); // shows absolute path to file
            say("Total words: " + count); // displays count of words in document
            
        }
        catch(Exception e){
            System.err.println("Message: " + e); // displays error message
        }
        
        
        
        
    }
    

    
    public static void say(String text){
        System.out.println(text);
    }
    
}
