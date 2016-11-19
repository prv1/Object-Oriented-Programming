/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jmenuframe;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
/**
 *
 * @author phillipviau
 */
public class JMenuFrame extends JFrame implements ActionListener {
private JMenuBar mainBar = new JMenuBar();
private JMenu menu1 = new JMenu("File");
private JMenu menu2 = new JMenu("Colors");
private JMenuItem exit = new JMenuItem("Exit");
private JMenu bright = new JMenu("Bright");
private JMenuItem dark = new JMenuItem("Dark");
private JMenuItem white = new JMenuItem("White");
private JMenuItem pink = new JMenuItem("Pink");
private JMenuItem yellow =  new JMenuItem("Yellow");
private JLabel label = new JLabel("Hello");

    public JMenuFrame(){
        setTitle("Menu Demonstration");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setJMenuBar(mainBar);
        mainBar.add(menu1);
        mainBar.add(menu2);
        menu1.add(exit);
        menu2.add(bright);
        menu2.add(dark);
        menu2.add(white);
        bright.add(pink);
        bright.add(yellow);
        exit.addActionListener(this);
        dark.addActionListener(this);
        white.addActionListener(this);
        pink.addActionListener(this);
        yellow.addActionListener(this);
        add(label);
        label.setFont(new Font("Arial", Font.BOLD, 26));
        
        
    }
    
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
        Container con = getContentPane();
        if(source == exit)
            System.exit(0);
        else if(source == dark)
            con.setBackground(Color.BLACK);
        else if(source == white)
            con.setBackground(Color.WHITE);
        else if(source == pink)
            con.setBackground(Color.PINK);
        else
            con.setBackground(Color.YELLOW);
        
    
            
        
    }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JMenuFrame2.main(args);
        //JMenuFrame mFrame = new JMenuFrame();// TODO code application logic here
        //final int WIDTH = 250, HEIGHT = 200;
        //mFrame.setSize(WIDTH, HEIGHT);
        //mFrame.setVisible(true);
    }
    
}
