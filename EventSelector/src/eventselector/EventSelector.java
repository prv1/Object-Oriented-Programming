/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventselector;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
/**
 *
 * @author phillipviau
 */
public class EventSelector extends JFrame implements ActionListener {

    private JMenuBar mainBar = new JMenuBar();
    private JMenu menu1 = new JMenu("File");
    private JMenu menu2 = new JMenu("Event Types");
    private JMenuItem exit = new JMenuItem("Exit");
    private JMenu adult = new JMenu("Adult");
    private JMenu child = new JMenu("Child");
    private JMenuItem adultBirthday = new JMenuItem("Birthday");
    private JMenuItem anniversary = new JMenuItem("Anniversary");
    private JMenuItem retirement = new JMenuItem("Retirement");
    private JMenuItem adultOther = new JMenuItem("Other");
    private JMenuItem childBirthday = new JMenuItem("Birthday");
    private JMenuItem childOther = new JMenuItem("Other");
    
    private JPanel birthdayPanel = new JPanel();
    private JPanel otherPanel = new JPanel();
    private JLabel birthdayLabel = new JLabel("Birthday events are our specialty");
    private JLabel otherLabel = new JLabel("We have lots of ideas for memorable events");
    private JPanel buttonPanel = new JPanel();
    private JRadioButton radButton1 = new JRadioButton("Formal events");
    private JRadioButton radButton2 = new JRadioButton("Casual events");
    
    public EventSelector(){
        setTitle("Event Selector");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        composeMenus();
        addActionListeners();
        layoutComponents();
    }
    
    public void composeMenus(){
        setJMenuBar(mainBar);
        mainBar.add(menu1);
        mainBar.add(menu2);
        menu1.add(exit);
        menu2.add(adult);
        menu2.add(child);
        adult.add(adultBirthday);
        adult.add(anniversary);
        adult.add(retirement);
        adult.add(adultOther);
        child.add(childBirthday);
        child.add(childOther);
    }
    
    public void addActionListeners(){
        exit.addActionListener(this);
        adultBirthday.addActionListener(this);
        anniversary.addActionListener(this);
        retirement.addActionListener(this);
        adultOther.addActionListener(this);
        childBirthday.addActionListener(this);
        childOther.addActionListener(this);
        
        
    }
    
    public void layoutComponents(){
        birthdayPanel.setLayout(new FlowLayout());
        otherPanel.setLayout(new GridLayout(2,1,3,3));
        birthdayPanel.add(birthdayLabel);
        birthdayPanel.add("other", otherLabel);
        birthdayPanel.add("buttons", buttonPanel);
        buttonPanel.add(radButton1);
        buttonPanel.add(radButton2);
        add(birthdayPanel);
        add(otherPanel);
        
    }
    
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
        Container con = getContentPane();
        if(source == exit)
            System.exit(0);
        else if(source == childBirthday || source == childOther)
            con.setBackground(Color.pink);
        if(source == adultBirthday || source == childBirthday){
            birthdayPanel.setBackground(Color.yellow);
            otherPanel.setBackground(Color.white);
        }else{
            birthdayPanel.setBackground(Color.white);
            otherPanel.setBackground(Color.yellow);
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EventSelector frame = new EventSelector();// TODO code application logic here
        final int WIDTH = 400, HEIGHT = 200;
        frame.setSize(WIDTH, HEIGHT);
        frame.setVisible(true);
    }
    
}
