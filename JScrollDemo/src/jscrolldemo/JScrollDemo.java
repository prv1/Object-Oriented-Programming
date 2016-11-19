/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jscrolldemo;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author phillipviau
 */
public class JScrollDemo extends JFrame {
private JPanel panel = new JPanel();
private JScrollPane scroll = new JScrollPane(panel, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
private JLabel label = new JLabel("Four score and seven");
private Font bigFont = new Font("Arial", Font.PLAIN,20);
private Container con;

    public JScrollDemo(){
        super("JScrollDemo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        con = getContentPane();
        label.setFont(bigFont);
        con.add(scroll);
        panel.add(label);
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int WIDTH = 180, HEIGHT = 100;// TODO code application logic here
        JScrollDemo aFrame = new JScrollDemo();
        aFrame.setSize(WIDTH, HEIGHT);
        aFrame.setVisible(true);
    }
    
}
