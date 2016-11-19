/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeefileproject;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author phillip389
 */
public class EmployeeFileProject {
private static final Scanner input = new Scanner(System.in);
private static final String[] userMenu = {"Display/Read Employee Information", "Write to Employee Information File", "Search Employee Information File", "Exit"};
private static final Path file1 = Paths.get("EmployeeList.txt");
private static final String[] userInfo = {"Enter ID: ", "Enter First Name: ", "Enter Last Name: "}; 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int EXIT = userMenu.length;
        int userInput = 0;
        
        
        
            
        
            while(userInput != EXIT){
                for(int i = 0; i < userMenu.length; i++){
                    say((i+1) + ". " + userMenu[i]);
                    
                }
                
                userInput = askInt("Please make a selection: >> ");
                
                switch(userInput){
                    case 1:
                        displayFile();
                        break;
                    case 2:
                        writeFile();
                        break;
                    case 3:
                        break;
                    default:
                        say("Incorrect entry. Please try again!");
                }
            }
        
        
        
    }
    
    public static void displayFile(){
        try (BufferedReader br = new BufferedReader(new FileReader(" " + file1))) {
        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        }
        catch(IOException e){
            say("Message: " + e.getMessage());
        }
    }
    
    public static void writeFile(){
        try
        {
            
            StringBuffer sb = new StringBuffer("");
            
            FileWriter fw = new FileWriter(" " + file1,true); //the true will append the new data
            fw.write("\n");
            for(int i = 0; i < userInfo.length; ++i){
                
                if(i > 0 && i < (userInfo.length))
                    sb.append(",");
                
                sb.append(askString(userInfo[i]));
                
            }
            String s = sb.toString() + System.getProperty("line.separator");
            byte[] data = s.getBytes();
            fw.write(s);
            fw.close();
        }
        catch(IOException e)
        {
            System.err.println("IOException: " + e.getMessage());
        }
    }
    
    public static int askInt(String text){
        
        System.out.print(text);

        return input.nextInt();

    }
    
    public static void say(String text){
        System.out.println(text);
    }
    
    public static String askString(String text){
        System.out.print(text);
        return input.next();
    }
    
}
