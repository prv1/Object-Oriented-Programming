/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usechildren;

import java.util.Scanner;

/**
 *
 * @author phillip389
 */
public class Female extends Child {
    
        public Female(){

        super("Bekki","female");
        setAge();
        display();
    }
    
    public void setAge(){
        Scanner input = new Scanner(System.in);
        int age = 0;
        super.ask("Enter age: >> ");
        age = input.nextInt();
       super.setAge(age);
    }
    
    public void display(){
        System.out.println(super.toString());
    }
}
