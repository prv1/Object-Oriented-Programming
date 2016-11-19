/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package friendloop;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author phillip389
 */
public class FriendLoop extends JFrame implements ActionListener {
JLabel question = new JLabel("What is your name?");
    Font bigFont = new Font("Arial", Font.BOLD, 16);
    JTextField answer = new JTextField(10);
    JButton pressMe = new JButton("Press Me");
    JButton enabled = new JButton("Change Friends");
    JButton disabled = new JButton("Change Friends");
    JLabel greeting = new JLabel("Amy");
    final int WIDTH = 275, HEIGHT = 225;
    int counter = 0;
    public FriendLoop(){
        //super("Hello Frame");
        super("Enabler");
        setSize(WIDTH, HEIGHT);
        disabled.setSize((WIDTH-10), 30);
        setLayout(new FlowLayout());
        question.setFont(bigFont);
        greeting.setFont(bigFont);

        add(disabled);
        add(greeting);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //enabled.addActionListener(this);
        disabled.addActionListener(this);
        //answer.addActionListener(this);*/
        

    }
    public static void main(String[] arg)
    {
        FriendLoop frame = new FriendLoop();
        frame.setSize(275, 225);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        
        //Object source = e.getSource();
        //if(source instanceof JTextField){
           //System.out.println("Enter pressed");
        //}
        //String name = answer.getText();
        //String greet = "Hello, " + name;
        //greeting.setText(greet);
        Object source = e.getSource();
        if(source == disabled){
            counter++;
            if(counter == 1)
                greeting.setText("Beth");
            else if(counter == 2)
                greeting.setText("Charlie");
            else if(counter == 3)
                greeting.setText("Dave");
            else if(counter == 4)
                greeting.setText("Emma");        
            else if(counter == 5){
                counter = 0;
                greeting.setText("Amy");
            }
            
                
        }
    }
    
}
