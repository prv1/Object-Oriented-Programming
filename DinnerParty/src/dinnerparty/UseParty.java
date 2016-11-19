/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinnerparty;

/**
 *
 * @author prv1
 */
public class UseParty extends Party{
    private int dinnerChoice;
    
    public int getDinnerChoice()
    {
        return dinnerChoice;
    }
    
    public void setDinnerChoice(int choice){
        dinnerChoice = choice;
    }
    
}
