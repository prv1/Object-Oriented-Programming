/*
 * Phillip Viau
 * 02/15/2016
 * Base game for a word comparison
 */
package wordgamesprint;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author phillip389
 */
public class WordGameSprint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean bContinue = true;
        
        String[] password = {"Block", "Feed", "House", "Homework", "Camper", "People"}; // default word to compare against for random number generator
        
        int random = RandomInt(); // generates random number from 0-5
        do{
        
        //ask("Enter Word: >> "); // displays message to user indicating input
        
        // compares userInput with wordToCompare and displays message if correct or not
        if(ask("Enter Word: >> ").equals(password[random])){
            
        
        //if(input.nextLine().equals(password[random])){ // adds input to compare without assigning to variable
            say("Congrats");  // if correct displays this message
            bContinue = false; // changes boolean to false if password matches user input
        }else{
            say("Fail");  // if wrong displays this message
        }
        }while(bContinue); // while if boolean is true
        
    }
    
    public static String ask(String text){// shorter method for asking text to user
        Scanner input = new Scanner(System.in); // creates new Scanner for input
        System.out.print(text); // displays text from passed variable
        
        return input.nextLine(); // returns input string to calling method
    }
    
    public static void say(String text){// shorter method for displaying text to user
        System.out.println(text); // displays text from passed variable
    }
    
    public static int RandomInt(){ // method for generating and returning a random number
        Random rand = new Random();
        int random = rand.nextInt(6);
        return random;
        
    }
    
}
