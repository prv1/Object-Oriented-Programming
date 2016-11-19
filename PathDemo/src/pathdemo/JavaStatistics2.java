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
public class JavaStatistics2 {
    public static void main(String[] args){
        Path file1 = 
                Paths.get("C:\\Java\\Chapter.13\\TestData1.txt");
        Path file2 = 
                Paths.get("C:\\Java\\Chapter.13\\TestData2.txt");
        try{
            BasicFileAttributes attr1 = 
                    Files.readAttributes(file1, BasicFileAttributes.class);
            BasicFileAttributes attr2 = 
                    Files.readAttributes(file2, BasicFileAttributes.class);
            System.out.println("Path for TestData1 is " + file1.getParent());
            System.out.println("Path for TestData2 is " + file2.getParent());
            if(file1.getParent().toString() != file2.getParent().toString())
                System.out.println("Files are not in the same folder");
            else
                System.out.println("Files are in the same folder");
            
                
        }
        catch(IOException e){
            System.out.println("IO Exception");
        }
    }
}
