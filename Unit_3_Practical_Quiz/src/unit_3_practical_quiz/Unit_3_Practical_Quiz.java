/*
 * Viau, Phillip
 * 04/01/2016
 * program that displays two random images after roll is clicked 
 */
package unit_3_practical_quiz;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
/**
 *
 * @author phillip389
 */
public class Unit_3_Practical_Quiz extends JFrame implements ActionListener { // class that extends jframe implements actionListener
     // instanced variables
    private Random rand = new Random(); // creates random variable
    private JButton roll = new JButton("Roll"); // creates default button
    private Container con = getContentPane(); // creates pane for window
    private ImageIcon diceImage1 = new ImageIcon("images/dice1.gif"); // defaults imageicon
    private ImageIcon diceImage2 = new ImageIcon("images/dice4.gif"); // defaults imageicon
    private JLabel player1Dice = new JLabel(diceImage1); // creates label
    private JLabel player2Dice = new JLabel(diceImage2); // creates label
    private JPanel panel = new JPanel(); // creates new panel
    private JPanel gridPanel = new JPanel(); // creates new panel
    private final int WIDTH = 275, HEIGHT = 295; // defaults height and width

    public Unit_3_Practical_Quiz(){
        setTitle("Dice"); // sets title
        setVisible(true); // displays application to screen when program ran
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exits application if user closes
        setSize(WIDTH,HEIGHT); // sets the size of window
        setLayout(new FlowLayout()); // sets layout to flowlayout
        setLayout(); // runs method setLayout
        roll.addActionListener(this); // add action for button
    }

    public void setLayout(){
        
        gridPanel.setLayout(new GridLayout(1,2,-4,0)); // creates gridLayout for jpanel
        panel.setLayout(new GridLayout(2,1,0,0));
        panel.add(gridPanel);
        panel.add(roll); // adds button to panel
        roll.setPreferredSize(new Dimension(260, 128)); // sets button size in layout
        gridPanel.add(player1Dice); // adds label with default imageicon
        gridPanel.add(player2Dice);// adds label with default imageicon
        add(panel);// adds panel to layout
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { // main method at start
        Unit_3_Practical_Quiz frame = new Unit_3_Practical_Quiz();// TODO code application logic here
    
    }
    
    public void actionPerformed(ActionEvent e){ // actionPerformed method
        Object source = e.getSource(); // gets source of click
        ImageIcon i1 = new ImageIcon("images/dice" + randNumberGenerator() + ".gif"); // creates new imageicon local to actionperformed
        ImageIcon i2 = new ImageIcon("images/dice" + randNumberGenerator() + ".gif");// creates new imageicon local to actionperformed

        if(source == roll){ // checks if user clicks roll button
            player1Dice.setIcon(i1); // sets label to new icon
            player2Dice.setIcon(i2); // sets label to new icon
        }
    }
    
    public int randNumberGenerator(){ // random method
        return rand.nextInt(6) + 1; // generates random number between 1 - 6
    }
    
}
