/*
 * Phillip Viau
 * 03/14/2016
 * displays usermenu with options to open, close bank, display, add, and remove accounts
 */
package bank;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.io.*;
import pti.bank.*;
import java.util.*;

/**
 *
 * @author phillip389
 */
public class bank {
private String[] userMenuOptions = {"Open Bank", "Close Bank" , "Display All Accounts", "Add an Account", "Remove an Account", "Quit"};
private final File file1 = new File("bankAccounts.txt");
private final String[] userInfo = {"Enter ID: ", "Enter Name: ", "Enter Balance: "}; 
private final Scanner input = new Scanner(System.in);
private StringBuffer sb = new StringBuffer("");
private boolean fileOpen;
private FileWriter fw;
private ArrayList<Account> accounts;
    /**
     * @param args the command line arguments
     */
     
     

    public bank(){
        fileOpen = false;
    }
    public static void main(String[] args) {
        
          bank bank = new bank();
        //while(bank.menu() < bank.userMenuOptions.length ){
            bank.menu();
         // }
          
    }
    
    public int menu(){
        
        int EXIT = userMenuOptions.length; // assigns the length to an integer
        
        int userInput = 0;// assigns user input to integer
        //bank bank = new bank();
            while(userInput != EXIT){ // as long as userinput doesnt equal exit integer then it continues
                for(int i = 0; i < userMenuOptions.length; i++){
                    say("{" + (i+1) + "} " + userMenuOptions[i]); // displays usermenu
                    
                }
                
                userInput = askInt("Please make a selection: >> ");
                
                switch(userInput){ // runs code based on userinput
                    case 1:
                        load(); // runs load method
                        break;
                    case 2:
                        write(); // runs write method
                        break;
                    case 3:
                        toString(); // displays account info to screen
                        break;
                    case 4:
                        addAccount(); // runs method to add an account to file
                        break;
                    case 5:
                        removeAccount(); // removes account from file
                        break;
                    case 6:
                        say("Thank you for using PTI Bank services"); // exits program
                        break;
                    default:
                        say("Incorrect entry. Please try again!"); // displays if above options not entered
                }
            }
            return userInput; // returns to calling method
    }
    
    public void load(){
        if(fileOpen == false){ //if file is not open try block is skipped
            accounts = new ArrayList<Account>();
            
            try (BufferedReader br = new BufferedReader(new FileReader("" + file1))) { // creates new buffered reader
                
                String line = null; // creates variable to assign line to to test if null
                int brLen = 0;// variable for counting lines
                    while ((line = br.readLine()) != null) {
                        System.out.println(line);
                        //line = br.readLine();
                        brLen++;
                        for(int i = 0; i < brLen; i++){
                            //accounts.add();
                        }
                    }

                this.fileOpen = true; // assigns true to designate if "file" is loaded
            }
            catch(IOException e){
                say("Message: " + e.getMessage()); // displays message if error occurs
            }
            
        
        }else{
            say("File is already open, please close the file"); // if file is already "open" then this is displayed to user
        }
        
    }
    
    public void write(){
        if(fileOpen == true){ // if file isnt loaded then try isnt executed
        
        try
        {
            
            if(sb.length() == 0){ // if stringbuilder is empty then write is not executed
                say("No new data to add"); // displays message
            }else{
                fw = new FileWriter("" + file1,true); // creates new filewriter for adding data
                fw.write("\n"); // writes new line to file

                String s = System.getProperty("line.separator") + sb.toString() + System.getProperty("line.separator"); // concactenates stringbuilder to string
                byte[] data = s.getBytes(); // assigns data to a byte array and prepares for writing to file
                fw.write(s); // writes data to file
                sb = sb.replace(0, sb.length(), ""); // clears stringbuffer with new text
                fw.close(); // closes filewriter
                fileOpen = false; // closes the file
            }
            
        }
        catch(IOException e)
        {
            System.err.println("IOException: " + e.getMessage()); // displays message if error occurs
        }
        
        
        }else{
            say("File is not open, please open the file first"); // displays message if file is not open
        }
        
    }
    

    
    public void addAccount(){
    if(fileOpen == true){
        int temp = askInt("What type of account would you like to add?\n1. Checking\n2.Savings\n>> "); // asks and assigns to temporary variable for if statement
        
        if(temp == 1){ // appends stringbuilder with checking if user enters 1
                sb.append("CHECKING_");                     
            }else if(temp == 2){ // appends stringbuilder with savings if user enters 2
                sb.append("SAVINGS_");
            }else{
                temp = askInt("Invalid entry, try again?\n1. Yes\n2.No");
                    if(temp == 1){
                        addAccount(); // reruns addaccount if they wish to try again
                    }else if(temp == 2){
                        say("Exiting!"); // exits adding account and returns to menu
                    }else{
                        say("Invalid Entry"); // displays message if 1 or 2 is not selected
                    }
            
            }
        
        for(int i = 0; i < userInfo.length; ++i){ // runs through length of userinfo to ask
            
            
            
        if(i > 0 && i < (userInfo.length))
                        sb.append("_"); // adds splace if not on first or last index
                    
        sb.append(askString(userInfo[i]));  // adds string to string builder   
        }
    }else{
        say("File is not open, please open the file first"); // displays error if file is close
    }
        
    }
    
    public void removeAccount(){
    if(fileOpen == true){
        say("Which line would you like to remove"); // question to see what line to remove
        String lineToRemove = input.next();// recieves user input for removal of line
        try {

            //File inFile = new File(file1);

            if (!file1.isFile()) { // sees if file exists
                System.out.println("Parameter is not an existing file");
                return; // exits method if doesnt exist
            }

            // Construct the new file that will later be renamed to the original
            // filename.
            File tempFile = new File(file1.getAbsolutePath() + ".tmp"); // creates temporary file for writing new lines to

            BufferedReader br = new BufferedReader(new FileReader(file1));// creats new buffered reader for reading lines
            PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

            String line = null; 

            // Read from the original file and write to the new
            // unless content matches data to be removed.
            while ((line = br.readLine()) != null) { // if line is not null then it continues

                if (!line.trim().equals(lineToRemove)) { // if line equals user input then skips it

                    pw.println(line); // prints line to temporary file
                    pw.flush(); // flushes printwriter from writing to next line
                }
            }
            pw.close(); // closes print writer
            br.close(); // closes buffered reader

            // Delete the original file
            if (!file1.delete()) { // checks if file can be deleted
                System.out.println("Could not delete file");  // displays error if can not delete
                return; // exits method if file cant be deleted
            }

            // Rename the new file to the filename the original file had.
            if (!tempFile.renameTo(file1)) // checks if file can be renamed
                System.out.println("Could not rename file"); // displays message to user if file can not be renamed

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }else{
        say("File is not open, please open the file first");// displays message if file is not open
    }
    }
    
    public int askInt(String text){
        
        System.out.print(text); // displays passed variable to user

        return input.nextInt(); // gets user input and returns integer to calling method

    }
    
    public static void say(String text){
        System.out.println(text); // faster way of displaying message to user
    }
    
    public String askString(String text){
        System.out.print(text);//displays passed variable to user
        return input.next();// gets user input and returns string to calling method
    }
    
@Override
    public String toString(){
        if(fileOpen == true){ //if file is open try block is skipped
            accounts = new ArrayList<Account>(); // creates new array list
            
            try (BufferedReader br = new BufferedReader(new FileReader("" + file1))) { // creates new buffered reader
                //fw = new FileWriter("" + file1,true);
                String line = null; // creates new variable for testing if null

                    while ((line = br.readLine()) != null) { // checks if readline is null or not
                        say(line); // displays line to user
                        

                    }

                 
            }
            catch(IOException e){
                say("Message: " + e.getMessage()); // displays message if error occurs
            }
            
        
        }else{
            say("File is not open, please open the file first"); // dislays message to user if file is not open
        }        
        return ""; //returns empty string to calling method
        
    }
    
}
