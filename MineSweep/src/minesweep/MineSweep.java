/*
 * Phillip Viau
 * 03/27/2016
 * minesweeper user selects tiles that changes color based on random number, if ok turns green if not turns red
 */
package minesweep;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.awt.Color;

/**
 *
 * @author phillipviau
 */
public class MineSweep extends JFrame implements ActionListener {
    private JButton[] button = new JButton[20]; // generates 20 buttons for grid layout
    private JButton[] difficulty = new JButton[3]; // buttons for difficulty
    private String[] difficultyString = {"Easy", "Intermediate", "Difficult"};
    private int bombLocation; // creates a location for location
    private JLabel label = new JLabel("TEST");
    private JPanel panel = new JPanel(new BorderLayout());
    private GridLayout layout = new GridLayout(4,5,0,0);// sets window layout in grid
    private final int SIZE = 48; // changes grid size of each button to 48 px
    private final int HEIGHT = 500, WIDTH = 500; // creates variable for grid size
    private Container con = getContentPane(); // creates pane for window
    
    private Container buttonCon = getContentPane();
    private Random rand = new Random(); // generates a random instance
    private Color tile = Color.green; // changes default tiles to green
    private Color tileSelected = Color.yellow; // sets seleted title yellow if clicked
    private Color bomb = Color.RED; // sets color of bomb to red
    private int[] playerMove = new int[button.length]; // sets playermove array based on total buttons length
    private boolean bContinue; // boolean to continue
    
    public MineSweep(){
        setTitle("MineSweep");
        bombLocation = rand.nextInt(button.length - 1);
        //add(label);
        bContinue = true;

        panel.add(buttonCon, BorderLayout.NORTH);
        panel.add(con, BorderLayout.SOUTH);
        con.setLayout(layout); // sets the layout of grid
        buttonCon.setSize(HEIGHT-400,WIDTH);
        con.setSize(HEIGHT-100,WIDTH);
        panel.setLayout(new FlowLayout());
        for(int i = 0; i < difficulty.length; ++i){
            difficulty[i] = new JButton(difficultyString[i]);
            buttonCon.add(difficulty[i]);
            difficulty[i].addActionListener(this);
        }
        //panel.setSize(HEIGHT,WIDTH);
        for(int i = 0; i < button.length; ++i){
            playerMove[i] = 0;
            button[i] = new JButton(""); // creates new button
            button[i].setSize(SIZE, SIZE); // sets each button size
            button[i].setBackground(tile); // sets button to default color
            con.add(button[i]); // adds button to gridlayout container
            button[i].setOpaque(true); // sets button to opaque
            button[i].addActionListener(this); // adds an actionlistener to button
        }
        setContentPane(panel);
        
        repaint(); // repaints jframe contents
        setSize(HEIGHT,WIDTH); // sets the size of window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // stops program if closed
        setVisible(true); // sets the visibility of the window
        
    }
    
    public void actionPerformed(ActionEvent event){ // method when button is clicked
    Object source = event.getSource(); // creates an object for comparison
    
        for (int i = 0; i < button.length; i++) { // cycles through buttons for check against i variable
           if (source==button[i])  // check if button matches source
               if(playerMove[i] <  1){ // check to see if int variable is greater than default variable
                    
                   playerMove[i] = 1; // assigns player to int variable array
                    if(i == bombLocation){ // checks if bomblocation is same as button
                        bContinue = false;
                        button[i].setBackground(bomb); // sets button to red if is bomb location
                    }else{
                        button[i].setBackground(tileSelected); //sets button to green if not bomblocation integer
                    }
               }
        }
        
        if(!bContinue){
            for(int i = 0; i < button.length; ++i){
                if(playerMove[i] != 1) // checks all tiles if theyre not selected
                    button[i].setBackground(Color.GRAY); // changes non-selected tiles to gray
            }
        }    
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MineSweep frame = new MineSweep();// creates new instance of jframe
    }
    
}
