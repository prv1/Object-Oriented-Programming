/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pathdemo;

import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;
/**
 *
 * @author phillip389
 */
public class PathDemo5 {
    public static void main(String[] args){
        Path filePath = 
                Paths.get("C:\\Java\\Chapter.13\\Data.txt");
        try{
            BasicFileAttributes attr = 
                    Files.readAttributes(filePath, BasicFileAttributes.class);
        System.out.println("Creation time " + attr.creationTime());
        System.out.println("Last modified time " + attr.lastModifiedTime());
        System.out.println("Size " + attr.size());
        } 
        catch(IOException e){
            System.out.println("IO Exception");
        }
    }
}
