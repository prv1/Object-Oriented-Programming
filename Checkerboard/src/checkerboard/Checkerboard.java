/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkerboard;
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
/**
 *
 * @author phillipviau
 */
public class Checkerboard extends JFrame {
private final int ROWS = 8, COLS = 8, GAP = 2, NUM = ROWS * COLS;
private int x;
private JPanel pane = new JPanel(new GridLayout(ROWS, COLS, GAP, GAP));
private JPanel[] panel = new JPanel[NUM];
private Color color1 = Color.WHITE, color2 = Color.BLUE;
private Color tempColor;

public Checkerboard(){
    super("Checkerboard");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    add(pane);
    for(x = 0; x < NUM; ++x){
        panel[x] = new JPanel();
        pane.add(panel[x]);
        if(x % COLS == 0){
            tempColor = color1;
            color1 = color2;
            color2 = tempColor;
        }
        if(x % 2 == 0)
            panel[x].setBackground(color1);
        else
            panel[x].setBackground(color2);
        
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Checkerboard frame = new Checkerboard();
        final int SIZE = 300;// TODO code application logic here
        frame.setSize(SIZE, SIZE);
        frame.setVisible(true);
    }
    
}
