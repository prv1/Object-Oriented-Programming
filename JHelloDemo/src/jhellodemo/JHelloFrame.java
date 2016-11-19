/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jhellodemo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author phillip389
 */
public class JHelloFrame extends JFrame implements ActionListener {
    JLabel question = new JLabel("What is your name?");
    Font bigFont = new Font("Arial", Font.BOLD, 16);
    JTextField answer = new JTextField(10);
    JButton pressMe = new JButton("Press Me");
    JButton enabled = new JButton("Enabled");
    JButton disabled = new JButton("Disabled");
    JLabel greeting = new JLabel("");
    final int WIDTH = 275, HEIGHT = 225;
    int counter = 0;
    public JHelloFrame(){
        //super("Hello Frame");
        super("Enabler");
        setSize(WIDTH, HEIGHT);
        setLayout(new FlowLayout());
        question.setFont(bigFont);
        greeting.setFont(bigFont);
        //disabled.setEnabled(false);
        //add(question);
        //add(answer);
        //add(pressMe);
        //add(greeting);
        //add(enabled);
        add(disabled);
        add(greeting);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //enabled.addActionListener(this);
        disabled.addActionListener(this);
        //answer.addActionListener(this);*/
        

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
        if(source == enabled){
            enabled.setEnabled(false);
            disabled.setEnabled(true);
        }else{
            counter++;
            if(counter > 7)
                greeting.setText("Stop touching me, RAPE!!!");
            //disabled.setEnabled(false);
            //enabled.setEnabled(true);
        }
    }
    
}
