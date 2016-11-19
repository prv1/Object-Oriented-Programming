/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package useanimal;

/**
 *
 * @author phillip389
 */
public class UseAnimal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog myDog = new Dog();// TODO code application logic here
        Cow myCow = new Cow();
        Snake mySnake = new Snake();
        myDog.setName("My dog Murphy");
        myCow.setName("My cow Elsie");
        mySnake.setName("My snake Sammy");
        System.out.println(myDog.getName() + " says ");
        myDog.speak();
        System.out.println(myCow.getName() + " says ");
        myCow.speak();
        System.out.println(mySnake.getName() + " says ");
        mySnake.speak();
        
        Animal[] animalRef = new Animal[3];
        animalRef[0] = new Dog();
        animalRef[1] = new Cow();
        animalRef[2] = new Snake();
        for(int x = 0; x < 3; ++x){
            animalRef[x].speak();
        }
        
        
    }    
}
