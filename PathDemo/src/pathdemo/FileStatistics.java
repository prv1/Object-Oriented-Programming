/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pathdemo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/**
 *
 * @author phillip389
 */
public class FileStatistics {
    public static void main(String[] args){
        Path file1 = 
                Paths.get("C:\\Java\\Chapter.11\\quote.txt");
        Path file2 = 
                Paths.get("C:\\Java\\Chapter.11\\quote.docx");
        try{
            BasicFileAttributes attr1 = 
                    Files.readAttributes(file1, BasicFileAttributes.class);
            BasicFileAttributes attr2 = 
                    Files.readAttributes(file2, BasicFileAttributes.class);
        
        }
        catch(IOException e){
            System.out.println("IO Exception");
        }
        say("" + file1.toString());
    }
    public static void say(String text){
        System.out.println(text);
    }    
}
