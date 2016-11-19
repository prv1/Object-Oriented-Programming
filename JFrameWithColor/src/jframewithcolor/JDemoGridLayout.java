/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframewithcolor;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author phillipviau
 */
public class JDemoGridLayout extends JFrame {
    private JButton b1 = new JButton("Button 1");
    private JButton b2 = new JButton("Button 2");
    private JButton b3 = new JButton("Button 3");
    private JButton b4 = new JButton("Button 4");
    private JButton b5 = new JButton("Button 5");
    private GridLayout layout = new GridLayout(3,2,5,5);
    private Container con = getContentPane();
    
    public JDemoGridLayout(){
        con.setLayout(layout);
        con.add(b1);
        con.add(b2);
        con.add(b3);
        con.add(b4);
        con.add(b5);
        setSize(200,200);
    }
    
}
