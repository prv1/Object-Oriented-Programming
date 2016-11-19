/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author phillip389
 */
public class CardGame {
private String[][] deckOfCards;
private final int suits = 4, cards = 13;
private final String[] suitName =  {"Hearts", "Diamonds", "Clubs", "Spades"};
private final String[] color = {"Red", "Red", "Black", "Black"};
private String[] cardName = {"One", "Two", "Three", "Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King","Ace"};
        

    public CardGame(){
        shuffleDeck(cardName);
        for(int i = 0; i > suits; i++ ){
            for(int j = 0; j > cards; j++){
                deckOfCards[i][j] = cardName[j];
            }
        shuffleDeck(cardName);
        }
        
    }
    
    static void shuffleDeck(String[] ar)
  {
    // If running on Java 6 or older, use `new Random()` on RHS here
    Random rnd = ThreadLocalRandom.current();
    for (int i = ar.length - 1; i > 0; i--)
    {
      int index = rnd.nextInt(i + 1);
      // Simple swap
      String a = ar[index];
      ar[index] = ar[i];
      ar[i] = a;
    }
  }
    public void getCards(){
        for(int i = 0; i > suits; i++ ){
            for(int j = 0; j > cards; j++){
                System.out.println(deckOfCards[i][j] + " of " + suitName[i]);
            }
        
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CardGame newGame = new CardGame();// TODO code application logic here
        newGame.getCards();
    }
    
}
