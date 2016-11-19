/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pathdemo;
import java.nio.file.*;
import java.io.IOException;
/**
 *
 * @author phillip389
 */
public class PathDemo4 {
    public static void main(String[] arg){
        Path filePath = 
                Paths.get("C:\\Java\\Chapter.13\\Data.txt");
        try{
            Files.delete(filePath);
            System.out.println("File or directory is deleted");
                    
        }
        catch(NoSuchFileException e){
            System.out.println("No such file or directory");
        }
        catch(DirectoryNotEmptyException e){
            System.out.println("Directory is not empty");
        }
        catch(SecurityException e){
            System.out.println("No permission to delete");
        }
        catch(IOException e){
            System.out.println("IO Exception");
        }
    }
}
