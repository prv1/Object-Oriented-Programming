/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzamenu;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author phillip389
 */
public class PizzaMenu extends JFrame implements ActionListener {
    private JLabel priceLabel = new JLabel("$0.00");
    private String[] sizeArray = {"Small", "Medium", "Large"};
    private JComboBox size = new JComboBox();
    private float totalPrice, pizzaPrice, optionPrice;
    private float[] pizzaPriceArray = {7.99f, 8.99f, 9.99f};
    private float[] optionPriceArray = {0.75f, 1.50f, 0.0f, 1.25f, 0.75f, 0.95f};
    private String[] optionsString = {"Hot Peppers", "Sausage", "Plain", "Meatballs", "Sweet Peppers", "Pepperoni"};
    private JRadioButton[] optionsButton = new JRadioButton[optionsString.length];
    private int HEIGHT = 400, WIDTH = 400;
    private JMenuBar mainBar = new JMenuBar();
    private JMenu fileMenu = new JMenu("File"), helpMenu = new JMenu("Help");
    private String[] menuString = {"New Pizza", "About", "Exit", "Help"};
    private JMenuItem[] menuItem = new JMenuItem[menuString.length];
    private JPanel panel = new JPanel();
    private GridLayout gridLayout = new GridLayout(2,2,10,10);
    private ImageIcon pizzaIcon = new ImageIcon("pizza.gif");
    private JLabel pizzaImage = new JLabel(pizzaIcon);
    private JPanel buttonPanel = new JPanel(new GridLayout(3,2,5,5));
    private Container con = getContentPane();
    private JPanel comboPanel = new JPanel();
    private ButtonGroup buttonGroup = new ButtonGroup();
    
    public PizzaMenu(){
        setTitle("Pizza");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        con.setLayout(gridLayout);
        setLayout();
        composeMenu();
        addActionListener();
        pizzaPrice = pizzaPriceArray[size.getSelectedIndex()];
        priceLabel.setText("$" + pizzaPrice);
        
    }
    
    public void composeMenu(){
        setJMenuBar(mainBar);
        mainBar.add(fileMenu);
        mainBar.add(helpMenu);
        
        for(int i = 0; i < menuString.length; ++i){
            menuItem[i] = new JMenuItem(menuString[i]);
            if(i % 2 == 0){
                
                fileMenu.add(menuItem[i]);
            }else{
                
                helpMenu.add(menuItem[i]);
            }
          
        }
    }
    
    public void setLayout(){
        
        add(comboPanel);
        comboPanel.add(size);
        add(priceLabel);
        add(buttonPanel);
        for(int i = 0; i < optionsButton.length; ++i){
            optionsButton[i] = new JRadioButton(optionsString[i]);
            buttonPanel.add(optionsButton[i]);
            buttonGroup.add(optionsButton[i]);
        }
        
        for(int i = 0; i < sizeArray.length; ++i){
            size.addItem(sizeArray[i]);
        }
        
        add(pizzaImage);
    }
    
    public void addActionListener(){
        for(int i = 0; i < menuItem.length; ++i){
            menuItem[i].addActionListener(this);
        }
        
        size.addActionListener(this);

        for(int i = 0; i < optionsButton.length; ++i){
            optionsButton[i].addActionListener(this);
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PizzaMenu frame = new PizzaMenu();// TODO code application logic here
    }
    
    public void actionPerformed(ActionEvent e){
        
        int pizzaSize = size.getSelectedIndex();
        //totalPrice = basePrice + optionPrice + pizzaPriceArray[pizzaSize];
        pizzaPrice = pizzaPriceArray[size.getSelectedIndex()];
        
        
        for(int i = 0; i < optionsButton.length; i++){
            if(optionsButton[i].isSelected()){
                optionPrice = optionPriceArray[i];
                //totalPrice = basePrice + pizzaPrice + optionPrice;
            }
        }
        
        totalPrice = pizzaPrice + optionPrice;
        
        priceLabel.setText("$" + totalPrice);
        
    }
    
}
