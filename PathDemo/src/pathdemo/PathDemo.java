/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pathdemo;

import java.nio.file.*;

/**
 *
 * @author phillip389
 */
public class PathDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Path filePath = 
                Paths.get("C:\\Java\\Chapter\\Data.txt");
        int count = filePath.getNameCount();
        System.out.println("Path is " + filePath.toString());
        System.out.println("File name is " + filePath.getFileName());
        System.out.println("There are " + count + " elements in teh file path");
        for(int x = 0; x < count; ++x){
            System.out.println("Element " + x + " is " + 
                    filePath.getName(x));
        }
        PathDemo2.main(args);
        PathDemo3.main(args);
        PathDemo5.main(args);*/
        FileStatistics.main(args);
    }
    
}
