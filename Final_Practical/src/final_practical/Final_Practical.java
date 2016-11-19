/*
 * Viau, Phillip
 * 04/05/2016
 * user programs that displays price when user selects item
 */
package final_practical;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author phillip389
 */
public class Final_Practical extends JFrame implements ActionListener { // class that extends jframe and implements actionlistener
    final int HEIGHT = 400, WIDTH = 500; // sets height width of jframe window
    private JLabel clothingItem = new JLabel("Clothing Item"); // creates label for clothing item label
    private JMenuBar mainBar = new JMenuBar(); // creates new menubar for jframe
    private JMenu fileMenu = new JMenu("File"), helpMenu = new JMenu("Help");// adds drop menus
    private String[] comboItemsString = {"Select an Option", "Shoes", "Hats", "Pants"}; // 
    private float[] comboItemsPrice = {0.00f, 19.99f, 10.99f, 34.99f}; // array associated with combobox
    private JMenuItem exitMenu = new JMenuItem("Exit"), aboutMenu = new JMenuItem("About"); // menuitems for drop menus
    private JLabel priceLabel = new JLabel(""); // price label
    private JComboBox comboItems = new JComboBox(comboItemsString); // combobox that instantiates default values from array
    private JPanel panel = new JPanel(); // base panel for frame
    private GridLayout gridLayout = new GridLayout(1,2, 5, 5); // grid layout for top row
    private ImageIcon image = new ImageIcon("images/clothingstoreimage.png"); // image for default combo item
    private ImageIcon hats = new ImageIcon("images/hats.png"); // image for hat combo item
    private ImageIcon shoes = new ImageIcon("images/shoes.png"); // image for shoes combo item
    private ImageIcon pants = new ImageIcon("images/pants.png"); // image for pants combo item
    
    private JLabel imageLabel = new JLabel(image); // default label placeholder for image
    private JPanel comboPanel = new JPanel(new FlowLayout());
    private JPanel imagePanel = new JPanel(); // panel for imagepanel
    
    public Final_Practical(){
        setVisible(true); // sets visibility to true
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // when window is closed
        setSize(WIDTH, HEIGHT); // sets height width of frame
        setLayout(new FlowLayout()); // sets default layout of frame
        setLayout(); // runs method
        composeMenu(); // runs method
        setActionListener(); // runs method
        
        
    }
    
    public void setActionListener(){
        comboItems.addActionListener(this); // adds actionlistener for combobox
        exitMenu.addActionListener(this); // adds actionlistener for exitmenu
        aboutMenu.addActionListener(this); // adds actionlistener for aboutmenu
        
    }
    
    
    public void composeMenu(){
        setJMenuBar(mainBar); // adds mainbar to frame
        mainBar.add(fileMenu); // adds filemenu to mainbar
        mainBar.add(helpMenu); // adds helpmenu to mainbar
        fileMenu.add(exitMenu); // adds menuitem to filemenu
        helpMenu.add(aboutMenu); // adds menuitem to helpmenu
        fileMenu.setMnemonic('F'); // sets mnemonic for filemenu
        helpMenu.setMnemonic('H');// sets mnemonic for helpmenu
        exitMenu.setMnemonic('X');// sets mnemonic for exitmenu
        aboutMenu.setMnemonic('A');// sets mnemonic for aboutmenu
        
    }
    
    public void setLayout(){
        add(panel); // adds panel to frame
        add(imagePanel); // adds imagepanel to frame
        panel.setLayout(gridLayout); // sets layout of panel to gridLayout
        //panel.add(clothingItem);
        panel.add(comboPanel); // adds combopanel to panel
        panel.add(priceLabel); // adds pricelabel to panel
        comboPanel.add(clothingItem); // adds clothingitem to combopanel
        comboPanel.add(comboItems); // adds combobox to combopanel
        imagePanel.add(imageLabel); // adds imagelabel to imagepanel
        imageLabel.setSize(new Dimension(200,200)); //sets size of imagelabel
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { // default method
        Final_Practical frame = new Final_Practical();// TODO code application logic here
    }
    
    public void actionPerformed(ActionEvent e) // actionperformed method
    {
        Object source = e.getSource(); // gets source of button
        
        if(comboItems.getSelectedIndex() == 0) // if first item of combobox is selected
            imageLabel.setIcon(image); // sets image to default
        else if(comboItems.getSelectedIndex() == 1) // if second item of combobox is selected
            imageLabel.setIcon(shoes); // sets image to shoes
        else if(comboItems.getSelectedIndex() == 2) // if third item of combobox is selected
            imageLabel.setIcon(hats); // sets image to hats
        else if(comboItems.getSelectedIndex() == 3) // if fourth item of combobox is selected
            imageLabel.setIcon(pants); // sets image to pants
        
        priceLabel.setText("$" + comboItemsPrice[comboItems.getSelectedIndex()]); // sets price label text to the selectedindex and displays comboitems price
        
        if(source == exitMenu){ // if exitmenu is selected
            System.exit(0); // exits application
        }else if(source == aboutMenu){ // if aboutmenu is selected
            JOptionPane.showMessageDialog(null, "Phillip Viau 04/05/2016 Version 1.0"); // displays message dialog
        }
        
    }
}
