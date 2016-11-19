/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdemokeyframe;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 *
 * @author phillipviau
 */
public class JDemoKeyFrame extends JFrame implements KeyListener {
    private JLabel prompt = new JLabel("Type keys below:");
    private JLabel outputLabel = new JLabel();
    private JTextField textField = new JTextField(10);
    
    public JDemoKeyFrame(){
        setTitle("JKey Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        add(prompt, BorderLayout.NORTH);
        add(textField, BorderLayout.CENTER);
        add(outputLabel, BorderLayout.SOUTH);
        addKeyListener(this);
        textField.addKeyListener(this);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JDemoKeyFrame keyFrame = new JDemoKeyFrame();// TODO code application logic here
        final int WIDTH = 250, HEIGHT = 100;
        keyFrame.setSize(WIDTH, HEIGHT);
        keyFrame.setVisible(true);
    }
    
    public void keyTyped(KeyEvent e){
        char c = e.getKeyChar();
        outputLabel.setText("Last key typed: " + c);
    }
    
    public void keyPressed(KeyEvent e){
        
    }
    
    public void keyReleased(KeyEvent e){
        
    }
    
}
