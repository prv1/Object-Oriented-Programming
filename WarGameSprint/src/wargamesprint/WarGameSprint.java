/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wargamesprint;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

/**
 *
 * @author phillip389
 */
public class WarGameSprint extends JFrame implements ActionListener {

    private JButton button = new JButton("Next Battle"); // Creates array of buttons 
    private JMenuBar mainBar = new JMenuBar();
    private JMenu fileMenu = new JMenu("File"), helpMenu = new JMenu("Help");
    private String[] menuString = {"New Game", "Score", "Reset", "Help", "Exit", "About"};
    private JMenuItem[] menuItem = new JMenuItem[menuString.length];
    //private GridLayout layout = new GridLayout(3,3,0,0);// sets window layout in grid
    private Container con = getContentPane(); // creates pane for window
    private int player, playerScore, compScore, counted; // determines whos turn it is
    private JLabel titleLabel = new JLabel("War Card Game");

    private JLabel player1Label = new JLabel("");
    private JLabel player2Label = new JLabel("");
    private JLabel player1Score = new JLabel("0");
    private JLabel player2Score = new JLabel("0");
    private JLabel winLabel = new JLabel("");
    private Random rand = new Random();
    private JPanel panel = new JPanel();
    private JPanel gridPanel = new JPanel();
    private final int WIDTH = 400, HEIGHT = 800;
    private BorderLayout layout = new BorderLayout();
    private GridLayout cardLayout = new GridLayout(1,2,0,0);
    
    
   
    
    public int randNumberGen(){
        return rand.nextInt(52);
    }
    
    public WarGameSprint(){
        setTitle("War Card Game");
        composeMenuSystem();
        //setContentPane(panel);
        setLayout(new FlowLayout());
        setLayout();
        //JPanel jPanel = new JPanel();      
        //jPanel.add(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("resource/images/polygon.jpg"))));
        
        /*panel.add(con, BorderLayout.SOUTH);
        con.setLayout(cardLayout);
        con.add(player1Label);
        con.add(player2Label);
        con.setSize(400, 1500);
        panel.setSize(400, 800);*/
        addActionListeners();
        setSize(WIDTH,HEIGHT); // sets the size of window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // stops program if closed
        setVisible(true); // sets the visibility of the window
    }
    
    public void setLayout(){
        
        gridPanel.setLayout(new GridLayout(2,2,10,10));
        //gridPanel.setAlignmentX(TOP_ALIGNMENT);
        panel.add(titleLabel);
        titleLabel.setSize(WIDTH, 50);
        gridPanel.add(player1Label);
        gridPanel.add(player2Label);
        gridPanel.add(player1Score);
        gridPanel.add(player2Score);
  
        //player1Label.setText(player1Image.getClass().getClassLoader().getResource("2c.gif") + "");
        //player2Label.setText(player1Image.getClass().getClassLoader().getResource("2c.gif") + "");
        add(panel);
        add(gridPanel);
        
    }
    

    
    public void addActionListeners(){
        for(int i = 0; i < menuItem.length; ++i){
            menuItem[i].addActionListener(this);
        }
        
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
    
    public void actionPerformed(ActionEvent event){
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WarGameSprint frame = new WarGameSprint();// TODO code application logic here
    }
    
}
