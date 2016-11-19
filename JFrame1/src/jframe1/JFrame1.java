/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframe1;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author phillip389
 */
public class JFrame1 extends JFrame {
final int WIDTH = 400, HEIGHT = 200;
FlowLayout flow = new FlowLayout();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame1 myFrame = new JFrame1();
        myFrame.setVisible(true);
        myFrame.setLayout(myFrame.flow);
        
        //final int WIDTH = 1200, HEIGHT = 500;
        /*final int FRAME_WIDTH = 250, FRAME_HEIGHT = 100;
        Font headlineFont = new Font("Verdana", Font.BOLD, 36);
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame aFrame = new JFrame("First Frame");// TODO code application logic here
        aFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        aFrame.setVisible(true);
        aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel greeting = new JLabel("Good Day");
        JLabel greeting2 = new JLabel("Who are you?");
        greeting.setFont(headlineFont);
        aFrame.setLayout(new FlowLayout(FlowLayout.RIGHT));
        aFrame.add(greeting);
        aFrame.add(greeting2);*/
        //myFrame.setSize(WIDTH, HEIGHT);
        //myFrame.setVisible(true);
        //myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //myFrame.setLayout(flow);
        //JFrame1 mySecondFrame = new JFrame1();
        //myFrame.setBounds(myFrame.WIDTH, myFrame.HEIGHT, myFrame.WIDTH, myFrame.HEIGHT);
        //JLabel lyrics = new JLabel("\n" +
///"Feeling so faithless, lost under the surface\n" +
//"");
        //myFrame.add(lyrics);
        
    }
    
    public JFrame1(){
        super("Lyrics to Numb");
        setSize(WIDTH, HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel lyrics1 = new JLabel("I'm tired of being what you want me to be");
        JLabel lyrics2 = new JLabel("Feeling so faithless, lost under the surface");
        JLabel lyrics3 = new JLabel("I don't know what you're expecting of me");
        //JLabel lyrics4 = new JLabel("This frame has many components");
        //heading.setFont(new Font("Arial", Font.BOLD, 16));
        //JTextField nameField = new JTextField(12);
        //JButton button = new JButton("Click to Continue");
        setLayout(flow);
        add(lyrics1);
        add(lyrics2);
        add(lyrics3);
        //add(lyrics4);
    }

    
    
    
}
