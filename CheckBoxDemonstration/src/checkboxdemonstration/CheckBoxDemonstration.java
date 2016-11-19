/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkboxdemonstration;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author phillip389
 */
public class CheckBoxDemonstration extends JFrame implements ItemListener{
FlowLayout flow = new FlowLayout();
JLabel label = new JLabel("What would you like to drink?");
JCheckBox coffee = new JCheckBox("Coffee", false);
JCheckBox cola = new JCheckBox("Cola", false);
JCheckBox milk = new JCheckBox("Milk", false);
JCheckBox water = new JCheckBox("Water", false);
String output, insChosen;

    public CheckBoxDemonstration(){
        super("Checkbox Demonstration");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        label.setFont(new Font("Arial", Font.ITALIC, 22));
        coffee.addItemListener(this);
        cola.addItemListener(this);
        milk.addItemListener(this);
        water.addItemListener(this);
        add(label);
        add(coffee);
        add(cola);
        add(milk);
        add(water);
    }
    
    public void itemStateChanged(ItemEvent check){
        Object source = check.getSource();
        if(source == coffee){
            if(coffee.isSelected()){
                label.setText("You selected coffee");
                coffee.setSelected(true);
                cola.setEnabled(false);
                milk.setEnabled(false);
                water.setEnabled(false);
            }else{
                label.setText("What would you like to drink?");
                coffee.setSelected(false);
                cola.setEnabled(true);
                milk.setEnabled(true);
                water.setEnabled(true);
            }

        }else if(source == cola){
            if(cola.isSelected()){
                label.setText("You selected cola");
                cola.setSelected(true);
                coffee.setEnabled(false);
                milk.setEnabled(false);
                water.setEnabled(false);
            }else{
                label.setText("What would you like to drink?");
                cola.setSelected(false);
                coffee.setEnabled(true);
                milk.setEnabled(true);
                water.setEnabled(true);
            }            

        }else if(source == milk){
            if(milk.isSelected()){
                label.setText("You selected milk");
                milk.setSelected(true);
                cola.setEnabled(false);
                coffee.setEnabled(false);
                water.setEnabled(false);
            }else{
                label.setText("What would you like to drink?");
                milk.setSelected(false);
                cola.setEnabled(true);
                coffee.setEnabled(true);
                water.setEnabled(true);
            }            
        }else if(source == water){
            if(water.isSelected()){
                label.setText("You selected water");
                water.setSelected(true);
                cola.setEnabled(false);
                milk.setEnabled(false);
                coffee.setEnabled(false);
            }else{
                label.setText("What would you like to drink?");
                coffee.setSelected(false);
                cola.setEnabled(true);
                milk.setEnabled(true);
                coffee.setEnabled(true);
            }            
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int FRAME_WIDTH = 350, FRAME_HEIGHT = 120;
        CheckBoxDemonstration frame = new CheckBoxDemonstration();
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setVisible(true);
    }
    
}
