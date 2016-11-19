/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframewithcolor;
import java.awt.*;
import javax.swing.*;
import java.awt.Color;
/**
 *
 * @author phillipviau
 */
public class JFrameWithColor extends JFrame {
private final int SIZE = 180;// TODO code application logic here
private Container con = getContentPane();
private JButton button = new JButton("Press Me");

    private JFrameWithColor(){
        super("Frame");
        setSize(SIZE,SIZE);
        con.setLayout(new FlowLayout());
        con.add(button);
        con.setBackground(Color.YELLOW);
        button.setBackground(Color.red);
        button.setForeground(Color.WHITE);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //JDemoBorderLayout frame = new JDemoBorderLayout();
        JDemoFlowLayout frame = new JDemoFlowLayout();
        frame.setVisible(true);

    }
    
}
