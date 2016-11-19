/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pathdemo2;
import java.util.Scanner;
import java.nio.file.*;

/**
 *
 * @author phillip389
 */
public class PathDemo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name;// TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a filename >> ");
        name = keyboard.nextLine();
        Path inputPath = Paths.get(name);
        Path fullPath = inputPath.toAbsolutePath();
        System.out.println("Full path is " + fullPath.toString());
    }
    
}
