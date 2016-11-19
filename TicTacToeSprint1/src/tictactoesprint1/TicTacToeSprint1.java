/*
 * Phillip Viau
 * 03/21/2016
 * Tic tac toe game
 */
package tictactoesprint1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author phillipviau
 */
public class TicTacToeSprint1 extends JFrame implements ActionListener { // class that extends jframe for windows and implements actionlistener
    
    //instanced variables
    private JButton[] button = new JButton[9]; // Creates array of buttons 
    private JMenuBar mainBar = new JMenuBar();
    private JMenu fileMenu = new JMenu("File"), helpMenu = new JMenu("Help");
    private String[] menuString = {"New Game", "Score", "Reset", "Help", "Exit", "About"};
    private JMenuItem[] menuItem = new JMenuItem[menuString.length];
    private GridLayout layout = new GridLayout(3,3,0,0);// sets window layout in grid
    private Container con = getContentPane(); // creates pane for window
    private int player, playerWin, compWin, counted; // determines whos turn it is
    int[] playerMove = new int[9]; // creates array of spots on board
    String[] character = {"X","O"}; // array of player symbols to place on board
    private boolean win = false; // boolean to check if a player won
    private Color[] color = new Color[2];
    private int[] skip = new int[3];
    //default constructor
    public TicTacToeSprint1(){
        setTitle("Tic Tac Toe"); // sets title of window
        color[0] = Color.green; // sets player x to green
        color[1] = Color.yellow; // sets player o to yellow
        composeMenuSystem();
        addActionListeners();
        
        con.setLayout(layout); // sets the layout of grid
        for(int i = 0; i < playerMove.length; ++i){
            //playerMove[i] = 2+i; // instantiates variable with null variables
            button[i] = new JButton(""); // creates new button
            //button[i].setText(""); // sets button text to empty string
            button[i].setSize(48, 48); // sets each button size
            con.add(button[i]); // adds button to gridlayout container
            button[i].addActionListener(this); // adds an actionlistener to button
        }
        resetBoard();
        resetGame();
        setSize(250,275); // sets the size of window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // stops program if closed
        setVisible(true); // sets the visibility of the window
    }
    
    public void composeMenuSystem(){
        setJMenuBar(mainBar);
        mainBar.add(fileMenu);
        mainBar.add(helpMenu);
        
        for(int i = 0; i < menuString.length; ++i){
            menuItem[i] = new JMenuItem(menuString[i]);
            if(i % 2 == 0){
                
                fileMenu.add(menuItem[i]);
            }else{
                
                helpMenu.add(menuItem[i]);
            }
          
        }
    }
    
    public void addActionListeners(){
        for(int i = 0; i < menuItem.length; ++i){
            menuItem[i].addActionListener(this);
        }
        
    }
    
    public void resetBoard(){
        for(int i = 0; i < playerMove.length; ++i){
            playerMove[i] = 2+i; // instantiates variable with null variables
            button[i].setText(""); // sets button text to empty string
            button[i].setBackground(Color.cyan);
            button[i].setEnabled(true);
        }
        for (int i = 0; i < skip.length; ++i)
            skip[i] = -1; // defaults all variables to variable not assiociated with assigned variables
        player = 0;
        win = false;
    }
    
    public void resetGame(){
        playerWin = 0;
        compWin = 0;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TicTacToeSprint1 frame = new TicTacToeSprint1();// creates new instance 
        
    }
    
    @Override
    public void actionPerformed(ActionEvent event){ // method when button is clicked
    Object source = event.getSource(); // creates an object for comparison
    
    
    
    for (int i = 0; i < button.length; i++) { // cycles through buttons for check against i variable
       if (source == button[i]) { // check if button matches source
           if(playerMove[i] > 1){ // check to see if int variable is greater than default variable
                playerMove[i] = player; // assigns player to int variable array
                button[i].setText(character[player]); // sets button from array based on player
                button[i].setBackground(color[player]); // sets button color based on player from color array
                if(!win) // if boolean is false then it resets turn
                    if(playerMove[i] < 2) // if playerMove array is not default data then alternates players turn
                        if(player == 0)
                            player = 1; // assigns player 2nd player if was 1st player
                        else if(player == 1)
                            player = 0; // assigns player 1st player if was 2nd player
           }
       }
    }
    
    for(int i = 0; i < menuItem.length; ++i){
        
        if(source == menuItem[i])
            switch(i){
                case 0:
                    resetBoard();
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Score: Player X Score: " + playerWin + " Computer O Score: " + compWin);
                    break;
                case 2:
                    resetGame();
                    resetBoard();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Player to have 3 of the same symbol wins");
                    break;
                case 4:
                    System.exit(0);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Tic-Tac-Toe Game made by Phillip Viau");
                    break;
            }  
    }
        con.invalidate();
        con.validate();
        repaint();
            if(playerMove[0] == playerMove[1] && playerMove[1] == playerMove[2] ){ // if all three are same on top row
                skip[0] = 0; // assigns button to array
                skip[1] = 1; // assigns button to array
                skip[2] = 2; // assigns button to array
            }else if(playerMove[3] == playerMove[4] && playerMove[4] == playerMove[5] ){ // if all three are same on 2nd row
                skip[0] = 3; // assigns button to array
                skip[1] = 4; // assigns button to array
                skip[2] = 5; // assigns button to array
            }else if(playerMove[6] == playerMove[7] && playerMove[7] == playerMove[8] ){ // if all three are same on 3rd row
                skip[0] = 6; // assigns button to array
                skip[1] = 7; // assigns button to array
                skip[2] = 8; // assigns button to array
            }else if(playerMove[0] == playerMove[3] && playerMove[3] == playerMove[6] ){ // if all three are same on 1st col
                skip[0] = 0; // assigns button to array
                skip[1] = 3; // assigns button to array
                skip[2] = 6; // assigns button to array
            }else if(playerMove[1] == playerMove[4] && playerMove[4] == playerMove[7] ){ // if all three are same on 2nd col
                skip[0] = 1; // assigns button to array
                skip[1] = 4; // assigns button to array
                skip[2] = 7; // assigns button to array
            }else if(playerMove[2] == playerMove[5] && playerMove[5] == playerMove[8] ){ // if all three are same on 3rd col
                skip[0] = 2; // assigns button to array
                skip[1] = 5; // assigns button to array
                skip[2] = 8; // assigns button to array
            }else if(playerMove[0] == playerMove[4] && playerMove[4] == playerMove[8] ){ // if all three are same on 1st diag
                skip[0] = 0; // assigns button to array
                skip[1] = 4; // assigns button to array
                skip[2] = 8; // assigns button to array
            }else if(playerMove[6] == playerMove[4] && playerMove[4] == playerMove[2] ){ // if all three are same on 2nd diag
                skip[0] = 6; // assigns button to array
                skip[1] = 4; // assigns button to array
                skip[2] = 2; // assigns button to array
            }

            for(int i = 0; i < playerMove.length; ++i){ // check for each button
               
                if(skip[0] >= 0){ // if skip array is not default
                        
                        if(i == skip[0] || i == skip[1] || i == skip[2]){ // checks if any skip variables match i
                            button[i].setBackground(color[playerMove[i]]); // sets button to player color
                            if(playerMove[i] == 0 && !win) // checks if first skip is player and runs once
                                playerWin++; // increments playerWin variable
                            else if(playerMove[i] == 1 && !win)// checks if first skip is computer and runs once
                                compWin++; // increments compWin Variable
                            win = true; // sets boolean to true
                        }else{
                            button[i].setEnabled(false); // disables button
                            button[i].setBackground(Color.gray); // changes button to gray
                            button[i].setText(""); // sets all non-winning buttons to empty string
                            
                            
                        }
            }
                
            }
            
            
    }
}