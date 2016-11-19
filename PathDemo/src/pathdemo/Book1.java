/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pathdemo;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
/**
 *
 * @author phillip389
 */
public class Book1 {
    public static void main(String[] arg){
        Path file1 = 
                Paths.get("C:\\Java\\Chapter.11\\DjSucks.txt");
        Path file2 = 
                Paths.get("C:\\Java\\Chapter.10\\DjBlows.txt");
        try{
            BasicFileAttributes attr1 = 
                    Files.readAttributes(file1, BasicFileAttributes.class);
            BasicFileAttributes attr2 = 
                    Files.readAttributes(file2, BasicFileAttributes.class);
            FileTime time1 = attr1.creationTime();
            say("Book1.txt Properties: ");
            say("Creation time is " + attr1.creationTime());
            say("Last modified time is " + attr1.lastModifiedTime());
            say("Size is " + attr1.size() + " bytes \n");
            FileTime time2 = attr1.creationTime();
            
            say("Book2.txt Properties: ");
            say("Creation time is " + time2);
            say("Last modified time is " + attr2.lastModifiedTime());            
            say("Size is " + attr2.size() + " bytes \n");
            
            if(time1.compareTo(time2) < 0)
                System.out.println("file1 was created before file2");
            else
                if(time2.compareTo(time2) > 0)
                    System.out.println("file1 was created after file2");
                else   
                    System.out.println("file1 and file2 were created at the same time"); 
        }
        catch(IOException e){
            System.out.println("IO Exception");
        }
    }
    
    public static void say(String text){
        System.out.println(text);
    }
}
