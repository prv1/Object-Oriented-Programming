/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pathdemo;
import java.nio.file.*;
import static java.nio.file.AccessMode.*;
import java.io.IOException;
/**
 *
 * @author phillip389
 */
public class PathDemo3 {
    public static void main(String[] args){
        Path filePath =
                Paths.get("C:\\Java\\Chapter.13\\Data.txt");
        System.out.print("Path is " + filePath.toString());
        try{
            filePath.getFileSystem().provider().checkAccess(filePath, READ, EXECUTE);
            System.out.println("File can be read and executed");
        }
        catch(IOException e){
            System.out.println("File cannot be used for this application");
        }
    }
}
