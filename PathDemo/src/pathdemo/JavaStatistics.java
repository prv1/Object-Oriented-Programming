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

/**
 *
 * @author phillip389
 */
public class JavaStatistics {
    public static void main(String[] args){
        Path filePath = 
                Paths.get("C:\\Java\\Chapter.13\\Chapter 13 Exercises\\FileStat.txt");
        try{
            BasicFileAttributes attr = 
                    Files.readAttributes(filePath, BasicFileAttributes.class);
        int count = filePath.getNameCount();
        System.out.println("Path is " + filePath.toString());
        System.out.println("File name is " + filePath.getFileName());
        System.out.println("Folder name is " + filePath.getName((filePath.getNameCount() - 2)));
        System.out.println("File Size is " + attr.size());
        System.out.println("Creation time " + attr.creationTime());
        System.out.println("Last modified time " + attr.lastModifiedTime());
        
        
        } 
        catch(IOException e){
            System.out.println("IO Exception");
        }
    }
}
