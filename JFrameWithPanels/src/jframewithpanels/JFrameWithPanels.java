/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframewithpanels;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author phillipviau
 */
public class JFrameWithPanels extends JFrame {
private final int WIDTH = 250, HEIGHT = 120;
private JButton button1 = new JButton("One");
private JButton button2 = new JButton("Two");
private JButton button3 = new JButton("Three");

public JFrameWithPanels(){
    super("JFrame with Panels");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    Container con = getContentPane();
    con.setLayout(new FlowLayout());
    con.add(panel1);
    con.add(panel2);
    panel1.add(button1);
    panel1.setBackground(Color.BLUE);
    panel2.add(button2);
    panel2.add(button3);
    panel2.setBackground(Color.BLUE);
    setSize(WIDTH, HEIGHT);

}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrameWithPanels frame = new JFrameWithPanels();// TODO code application logic here
        frame.setVisible(true);
    }
    
}
