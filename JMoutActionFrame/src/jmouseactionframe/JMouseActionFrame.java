/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jmouseactionframe;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author phillipviau
 */
public class JMouseActionFrame extends JFrame implements MouseListener {
    private int x, y;
    private JLabel label = new JLabel("Do something with the mouse");
    String msg = "";
    private int count;
    
        public JMouseActionFrame(){
            super("");
            setTitle("Mouse Actions");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new FlowLayout());
            addMouseListener(this);
            add(label);
        }
        
        public void mouseClicked(MouseEvent e){
            count++;
            int whichButton = e.getButton();
            msg = "You pressed mouse " + count + " times ";
            if(whichButton == MouseEvent.BUTTON1)
                msg += "button 1.";
            else
                if(whichButton == MouseEvent.BUTTON2)
                    msg += "button 2.";
                else
                    msg += "button 3.";
            msg += " You are at position " + e.getX() + ", " + e.getY() + ".";
            if(e.getClickCount() == 2)
                msg += " You double-clicked.";
            else
                msg += " You single-clicked.";
            label.setText(msg);
                
        }
        
        public void mouseEntered(MouseEvent e){
            msg = "You exited the frame.";
            label.setText(msg);
            
        }
        
    @Override
        public void mouseExited(MouseEvent e){
            msg = "You exited the frame.";
            label.setText(msg);
        }
        
        public void mousePressed(MouseEvent e){
            
        }
        
    @Override
        public void mouseReleased(MouseEvent e){
            
        }
                
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JMouseActionFrame mFrame = new JMouseActionFrame();// TODO code application logic here
        final int WIDTH = 750, HEIGHT = 300;
        mFrame.setSize(WIDTH, HEIGHT);
        mFrame.setVisible(true);
    }
    
}
