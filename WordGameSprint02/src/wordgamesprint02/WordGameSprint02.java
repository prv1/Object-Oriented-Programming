/*
 * Phillip Viau
 * 02/15/2016
 * Base game for a word comparison
 */
package wordgamesprint02;
import java.util.Scanner;
/**
 *
 * @author phillip389
 */
public class WordGameSprint02 {
private boolean bContinue; // boolean for continuing game
private String wordToCompare; // default word to compare against
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WordGameSprint02 newGame = new WordGameSprint02();
        newGame.start();
        
    }
    
    public WordGameSprint02(){
        this.bContinue = true;
        this.wordToCompare = "Test";
    }
    
    public void start(){
        
        do{
        Scanner input = new Scanner(System.in); // accepts input from user
        //System.out.print("Enter Word: >> "); // displays message to user indicating input
        ask("Enter Word"); // simpler way of displaying question to screen
        // compares userInput with wordToCompare and displays message if correct or not
            if(input.nextLine().equals(wordToCompare)) // adds input to compare without assigning to variable
                say("Congrats");  // if correct displays this message
            else
                say("Fail");  // if wrong displays this message
            
        }while(getbContinue());
    }
    
    public void ask(String text){
        System.out.print(text + ": >>");
    }
    
    public void say(String text){
        System.out.println(text);
    }
    
    public boolean getbContinue(){
        return bContinue;
    }
    
    public void setbContinue(boolean bContinue){
        this.bContinue = bContinue;
    }
    
    
    
    
}

